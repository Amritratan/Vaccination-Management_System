package com.example.vaccinationmanagementsystem.Repository;

import com.example.vaccinationmanagementsystem.Models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter,Integer> {
}