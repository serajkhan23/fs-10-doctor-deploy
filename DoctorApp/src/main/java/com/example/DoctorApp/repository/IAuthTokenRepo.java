package com.example.DoctorApp.repository;

import com.example.DoctorApp.model.AuthenticationToken;
import com.example.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByPatient(Patient patient);
}