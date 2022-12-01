package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
