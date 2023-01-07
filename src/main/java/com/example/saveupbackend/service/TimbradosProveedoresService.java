package com.example.saveupbackend.service;

import com.example.saveupbackend.model.TimbradosProveedores;
import com.example.saveupbackend.repository.TimbradosProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimbradosProveedoresService {

    @Autowired
    private TimbradosProveedoresRepository repository;

    public TimbradosProveedores create(TimbradosProveedores persona){
        return repository.save(persona);
    }

    public List<TimbradosProveedores> getAll(){
        return repository.findAll();
    }

    public void delete(TimbradosProveedores timbradosProveedores){
        repository.delete(timbradosProveedores);
    }

    public Optional<TimbradosProveedores> findByID (Long id){
        return repository.findById(id);
    }
}
