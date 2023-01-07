package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
