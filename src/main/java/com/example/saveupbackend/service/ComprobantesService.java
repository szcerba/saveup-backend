package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.repository.ComprobantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprobantesService {

    @Autowired
    private ComprobantesRepository repository;

    public Comprobantes create(Comprobantes persona){
        return repository.save(persona);
    }

    public List<Comprobantes> getAll(){
        return repository.findAll();
    }

    public void delete(Comprobantes comprobantes){
        repository.delete(comprobantes);
    }

    public Optional<Comprobantes> findByID (Long id){
        return repository.findById(id);
    }
}
