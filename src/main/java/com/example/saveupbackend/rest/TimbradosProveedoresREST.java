package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.TimbradosProveedores;
import com.example.saveupbackend.service.TimbradosProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/timbradosproveedores/")
public class TimbradosProveedoresREST {
    @Autowired
    private TimbradosProveedoresService service;

    @PostMapping
    private ResponseEntity<TimbradosProveedores> guardar(@RequestBody TimbradosProveedores timbradosProveedores){
        TimbradosProveedores temporal = service.create(timbradosProveedores);
        try {
            return ResponseEntity.created(new URI("/api/timbradosProveedores"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<TimbradosProveedores>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody TimbradosProveedores timbradosProveedores){
        service.delete(timbradosProveedores);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<TimbradosProveedores>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
