package com.example.saveupbackend.service;

import com.example.saveupbackend.model.Productos;
import com.example.saveupbackend.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository repository;

    public Productos create(Productos persona){
        return repository.save(persona);
    }

    public List<Productos> getAll(){
        return repository.findAll();
    }

    public void delete(Productos productos){
        repository.delete(productos);
    }

    public Optional<Productos> findByID (Long id){
        return repository.findById(id);
    }
}
