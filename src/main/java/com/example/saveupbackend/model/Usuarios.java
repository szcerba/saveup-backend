package com.example.saveupbackend.model;

import javax.persistence.*;

@Entity
@Table (name = "usuarios")
public class Usuarios extends BaseModel{
    @Id
    @GeneratedValue
    private Long id;
    private Boolean activo;
    private String password;
    private String username;
    @ManyToOne
    @JoinColumn(name = "id_clase")
    private Parametricos clase;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Parametricos getClase() {
        return clase;
    }

    public void setClase(Parametricos clase) {
        this.clase = clase;
    }
}
