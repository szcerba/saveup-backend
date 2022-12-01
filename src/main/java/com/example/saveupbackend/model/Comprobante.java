package com.example.saveupbackend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comprobante")
public class Comprobante {
    @Id
    @GeneratedValue
    private Long id;
    private Date fecha;
    private Double montoTotal;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor Proveedor;

//    private Long idnmumeroTimbrado;
//    private Long idTipoComprobante;

    private Date fechaCreacion;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public com.example.saveupbackend.model.Proveedor getProveedor() {
        return Proveedor;
    }

    public void setProveedor(com.example.saveupbackend.model.Proveedor proveedor) {
        Proveedor = proveedor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
