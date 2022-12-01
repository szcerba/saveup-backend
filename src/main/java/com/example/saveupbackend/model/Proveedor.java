package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue
    private Long id;
    private Boolean activo;
    private String codigo;
    private String direccion;
    private String nombre;
    @Column(name = "nombre_fantasia")
    private String nombreFantasia;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_tipo_proveedor")
    private Tipo tipoProveedor;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private Tipo tipoDocumento;
    @ManyToOne
    @JoinColumn(name = "id_tipo_persona")
    private Tipo tipoPersona;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tipo getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(Tipo tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public Tipo getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Tipo tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Tipo getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(Tipo tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
