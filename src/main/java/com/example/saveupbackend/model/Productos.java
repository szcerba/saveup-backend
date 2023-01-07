package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table (name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_codigo_barras")
    private Parametricos codigoBarras;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Parametricos marca;
    @ManyToOne
    @JoinColumn(name = "id_linea_producto")
    private Parametricos lineaProducto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Parametricos getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Parametricos codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Parametricos getMarca() {
        return marca;
    }

    public void setMarca(Parametricos marca) {
        this.marca = marca;
    }

    public Parametricos getLineaProducto() {
        return lineaProducto;
    }

    public void setLineaProducto(Parametricos lineaProducto) {
        this.lineaProducto = lineaProducto;
    }
}
