package com.example.DoctorApp.repository;

import com.example.DoctorApp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IDoctorRepo extends JpaRepository<Doctor,Long> {
}
