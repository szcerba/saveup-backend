package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Comprobantes;
import com.example.saveupbackend.service.ComprobantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comprobantes/")
public class ComprobantesREST {
    @Autowired
    private ComprobantesService service;

    @PostMapping
    private ResponseEntity<Comprobantes> guardar(@RequestBody Comprobantes comprobantes){
        Comprobantes temporal = service.create(comprobantes);
        try {
            return ResponseEntity.created(new URI("/api/comprobantes"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Comprobantes>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Comprobantes comprobantes){
        service.delete(comprobantes);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Comprobantes>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
