package com.Brayan_Pedraza.API_Franquicias.models;

import jakarta.persistence.*;

@Entity
@Table(name="MT_Perfiles")
public class MTPerfilesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID_MT_Perfiles;
    
    private String Nombre_Perfil;
    private Integer Jerarquia;
    private String Descripcion;

    
    public Long getId() {
        return ID_MT_Perfiles;
    }

    public void setId(Long id) {
        this.ID_MT_Perfiles = id;
    }

    public String getNombre() {
        return Nombre_Perfil;
    }

    public void setNombre(String nombre) {
        this.Nombre_Perfil = nombre;
    }

    public Integer getJerarquia() {
        return Jerarquia;
    }

    public void setJerarquia(Integer jerarquia) {
        this.Jerarquia = jerarquia;
    }

    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setJerarquia(String descripcion) {
        this.Descripcion = descripcion;
    }
}
