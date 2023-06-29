package com.example.vaccinationmanagementsystem.Models;
import com.example.vaccineManagement.Enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "user_name")
    private String name;

    private int age;

    @Column(unique = true)
    private String emailId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobileNo;

    @JsonIgnore
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Dose dose;

    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<com.example.vaccineManagement.Models.Appointment> appointmentList = new ArrayList<>();
}