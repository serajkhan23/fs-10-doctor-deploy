package com.example.DoctorApp.repository;

import com.example.DoctorApp.model.Appointment;
import com.example.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

    Appointment findFirstByPatient(Patient patient);
}
