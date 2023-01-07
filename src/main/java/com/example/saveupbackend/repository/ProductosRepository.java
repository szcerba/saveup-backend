package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
