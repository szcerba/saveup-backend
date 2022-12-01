package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_tipo")
    private TipoTipo tipoTipo;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
