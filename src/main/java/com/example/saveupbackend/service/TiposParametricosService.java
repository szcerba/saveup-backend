package com.example.saveupbackend.service;

import com.example.saveupbackend.model.TiposParametricos;
import com.example.saveupbackend.repository.TiposParametricosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiposParametricosService {

    @Autowired
    private TiposParametricosRepository repository;

    public TiposParametricos create(TiposParametricos persona){
        return repository.save(persona);
    }

    public List<TiposParametricos> getAll(){
        return repository.findAll();
    }

    public void delete(TiposParametricos tiposParametricos){
        repository.delete(tiposParametricos);
    }

    public Optional<TiposParametricos> findByID (Long id){
        return repository.findById(id);
    }
}
