package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Proveedores;
import com.example.saveupbackend.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores/")
public class ProveedoresREST {
    @Autowired
    private ProveedoresService service;

    @PostMapping
    private ResponseEntity<Proveedores> guardar(@RequestBody Proveedores proveedores){
        Proveedores temporal = service.create(proveedores);
        try {
            return ResponseEntity.created(new URI("/api/proveedores"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Proveedores>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Proveedores proveedores){
        service.delete(proveedores);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Proveedores>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
