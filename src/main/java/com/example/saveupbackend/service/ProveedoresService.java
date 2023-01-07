package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Proveedores;
import com.example.saveupbackend.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedoresService {

    @Autowired
    private ProveedoresRepository repository;

    public Proveedores create(Proveedores persona){
        return repository.save(persona);
    }

    public List<Proveedores> getAll(){
        return repository.findAll();
    }

    public void delete(Proveedores proveedores){
        repository.delete(proveedores);
    }

    public Optional<Proveedores> findByID (Long id){
        return repository.findById(id);
    }
}
