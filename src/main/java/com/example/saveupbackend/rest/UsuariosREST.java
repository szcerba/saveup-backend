package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Usuarios;
import com.example.saveupbackend.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios/")
public class UsuariosREST {
    @Autowired
    private UsuariosService service;

    @PostMapping
    private ResponseEntity<Usuarios> guardar(@RequestBody Usuarios usuarios){
        Usuarios temporal = service.create(usuarios);
        try {
            return ResponseEntity.created(new URI("/api/usuarios"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Usuarios>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Usuarios usuarios){
        service.delete(usuarios);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Usuarios>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
