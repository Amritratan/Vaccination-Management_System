package com.example.vaccinationmanagementsystem.Repository;


import com.example.vaccinationmanagementsystem.Models.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Integer> {
}