package com.example.DoctorApp.repository;

import com.example.DoctorApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
