package com.example.vaccinationmanagementsystem.Repository;


import com.example.vaccinationmanagementsystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    public Doctor findByEmailId(String emailId);

}