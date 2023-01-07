package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Usuarios;
import com.example.saveupbackend.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository repository;

    public Usuarios create(Usuarios persona){
        return repository.save(persona);
    }

    public List<Usuarios> getAll(){
        return repository.findAll();
    }

    public void delete(Usuarios usuarios){
        repository.delete(usuarios);
    }

    public Optional<Usuarios> findByID (Long id){
        return repository.findById(id);
    }
}
