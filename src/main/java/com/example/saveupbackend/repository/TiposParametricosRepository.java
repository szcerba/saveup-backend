package com.example.saveupbackend.repository;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.model.TiposParametricos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposParametricosRepository extends JpaRepository<TiposParametricos, Long> {
}
