package com.example.saveupbackend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comprobantes")
public class Comprobantes {
    @Id
    @GeneratedValue
    private Long id;
    private Long cambio;
    private Date fecha;
    @Column(name = "monto_total")
    private Double montoTotal;
    private String numero;
    @Column(name = "total_impuesto")
    private Double totalImpuesto;
    @Column(name = "total_iva_10")
    private Double totalIva10;
    @Column(name = "total_iva_5")
    private Double totalIva5;
    @Column(name = "total_exento")
    private Double totalExento;
    @ManyToOne
    @JoinColumn(name = "id_moneda")
    private Parametricos moneda;
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedores proveedor;
    @ManyToOne
    @JoinColumn(name = "id_numero_timbrado")
    private TimbradosProveedores numeroTimbrado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCambio() {
        return cambio;
    }

    public void setCambio(Long cambio) {
        this.cambio = cambio;
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

    public Double getTotalImpuesto() {
        return totalImpuesto;
    }

    public void setTotalImpuesto(Double totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }

    public Double getTotalIva10() {
        return totalIva10;
    }

    public void setTotalIva10(Double totalIva10) {
        this.totalIva10 = totalIva10;
    }

    public Double getTotalIva5() {
        return totalIva5;
    }

    public void setTotalIva5(Double totalIva5) {
        this.totalIva5 = totalIva5;
    }

    public Double getTotalExento() {
        return totalExento;
    }

    public void setTotalExento(Double totalExento) {
        this.totalExento = totalExento;
    }

    public Parametricos getMoneda() {
        return moneda;
    }

    public void setMoneda(Parametricos moneda) {
        this.moneda = moneda;
    }

    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public TimbradosProveedores getNumeroTimbrado() {
        return numeroTimbrado;
    }

    public void setNumeroTimbrado(TimbradosProveedores numeroTimbrado) {
        this.numeroTimbrado = numeroTimbrado;
    }
}
