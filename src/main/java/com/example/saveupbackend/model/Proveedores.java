package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedores {

    @Id
    @GeneratedValue
    private Long id;
    private Boolean activo;
    private String direccion;
    private String mail;
    private String nombre;
    @Column(name = "nombre_fantasia")
    private String nombreFantasia;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    private String web;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_tipo_proveedor")
    private Parametricos tipoProveedor;
    @ManyToOne
    @JoinColumn(name = "id_barrio")
    private Parametricos barrio;
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Parametricos ciudad;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Parametricos pais;
    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Parametricos sucursal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Parametricos getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(Parametricos tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public Parametricos getBarrio() {
        return barrio;
    }

    public void setBarrio(Parametricos barrio) {
        this.barrio = barrio;
    }

    public Parametricos getCiudad() {
        return ciudad;
    }

    public void setCiudad(Parametricos ciudad) {
        this.ciudad = ciudad;
    }

    public Parametricos getPais() {
        return pais;
    }

    public void setPais(Parametricos pais) {
        this.pais = pais;
    }

    public Parametricos getSucursal() {
        return sucursal;
    }

    public void setSucursal(Parametricos sucursal) {
        this.sucursal = sucursal;
    }
}
