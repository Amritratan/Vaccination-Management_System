package com.example.vaccinationmanagementsystem.Repository;

import com.example.vaccinationmanagementsystem.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}