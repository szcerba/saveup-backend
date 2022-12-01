package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Persona;
import com.example.saveupbackend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona/")
public class PersonaREST {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    private ResponseEntity<Persona> guardar(@RequestBody Persona persona){
        Persona temporal = personaService.create(persona);
        try {
            return ResponseEntity.created(new URI("/api/persona"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Persona>> listar(){
        return ResponseEntity.ok(personaService.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Persona persona){
        personaService.delete(persona);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Persona>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(personaService.findByID(id));
    }
}
