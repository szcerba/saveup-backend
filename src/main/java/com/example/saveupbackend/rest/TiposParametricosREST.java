package com.example.saveupbackend.rest;

import com.example.saveupbackend.model.TiposParametricos;
import com.example.saveupbackend.service.TiposParametricosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tiposparametricos/")
public class TiposParametricosREST {
    @Autowired
    private TiposParametricosService service;

    @PostMapping
    private ResponseEntity<TiposParametricos> guardar(@RequestBody TiposParametricos timbradosProveedores){
        TiposParametricos temporal = service.create(timbradosProveedores);
        try {
            return ResponseEntity.created(new URI("/api/timbradosProveedores"+temporal.getId())).body(temporal);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<TiposParametricos>> listar(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminar(@RequestBody TiposParametricos timbradosProveedores){
        service.delete(timbradosProveedores);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<TiposParametricos>> obtener(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findByID(id));
    }
}
