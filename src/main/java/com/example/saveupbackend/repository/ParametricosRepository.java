package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.model.Parametricos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParametricosRepository extends JpaRepository<Parametricos, Long> {
}
