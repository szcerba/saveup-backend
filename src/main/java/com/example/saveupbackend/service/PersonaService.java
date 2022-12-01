package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Persona;
import com.example.saveupbackend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona create(Persona persona){
        return personaRepository.save(persona);
    }

    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

    public void delete(Persona persona){
        personaRepository.delete(persona);
    }

    public Optional<Persona> findByID (Long id){
        return personaRepository.findById(id);
    }
}
