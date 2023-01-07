package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Parametricos;
import com.example.saveupbackend.service.ParametricosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parametricos/")
public class ParametricosREST {
    @Autowired
    private ParametricosService service;

    @PostMapping
    private ResponseEntity<Parametricos> guardar(@RequestBody Parametricos parametricos){
        Parametricos temporal = service.create(parametricos);
        try {
            return ResponseEntity.created(new URI("/api/parametricos"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Parametricos>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Parametricos parametricos){
        service.delete(parametricos);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Parametricos>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
