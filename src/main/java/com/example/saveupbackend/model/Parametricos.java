package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "parametricos")
public class Parametricos {

    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TiposParametricos tipoTipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TiposParametricos getTipoTipo() {
        return tipoTipo;
    }

    public void setTipoTipo(TiposParametricos tipoTipo) {
        this.tipoTipo = tipoTipo;
    }
}
