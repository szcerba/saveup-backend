package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.Productos;
import com.example.saveupbackend.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos/")
public class ProductosREST {
    @Autowired
    private ProductosService service;

    @PostMapping
    private ResponseEntity<Productos> guardar(@RequestBody Productos productos){
        Productos temporal = service.create(productos);
        try {
            return ResponseEntity.created(new URI("/api/productos"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Productos>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody Productos productos){
        service.delete(productos);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Productos>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
