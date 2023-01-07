package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Parametricos;
import com.example.saveupbackend.repository.ParametricosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParametricosService {

    @Autowired
    private ParametricosRepository repository;

    public Parametricos create(Parametricos persona){
        return repository.save(persona);
    }

    public List<Parametricos> getAll(){
        return repository.findAll();
    }

    public void delete(Parametricos parametricos){
        repository.delete(parametricos);
    }

    public Optional<Parametricos> findByID (Long id){
        return repository.findById(id);
    }
}
