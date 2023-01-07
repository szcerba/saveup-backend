package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Long> {
}
