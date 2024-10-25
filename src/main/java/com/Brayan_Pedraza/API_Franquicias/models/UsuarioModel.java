package com.Brayan_Pedraza.API_Franquicias.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID_Usuarios;
    @Column
    private Long ID_MT_Franquicias;
    @Column
    private Long ID_MT_Sucursales;
    private Long ID_MT_Perfiles;
    private String Nombre_Usuario;
    @Column
    private String Correo;
    @Column
    private String Clave;

    @ManyToOne // o @OneToMany, dependiendo de la relación
    @JoinColumn(name = "ID_MT_Perfiles", insertable = false, updatable = false)
    private MTPerfilesModel Perfiles;

    @JsonProperty("ID_Usuarios")
    public Long getId() {
        return ID_Usuarios;
    }
    @JsonProperty("ID_Usuarios")
    public void setId(Long id) {
        this.ID_Usuarios = id;
    }

    public Long getId_MT_Franquicias() {
        return ID_MT_Franquicias;
    }

    public void setId_MT_Franquicias(Long id_MT_Franquicias) {
        this.ID_MT_Franquicias = id_MT_Franquicias;
    }

    public Long getId_MT_Sucursales() {
        return ID_MT_Sucursales;
    }

    public void setId_MT_Sucursales(Long id_MT_Sucursales) {
        this.ID_MT_Sucursales = id_MT_Sucursales;
    }

    public Long getId_MT_Perfiles() {
        return ID_MT_Perfiles;
    }

    public void setId_MT_Perfiles(Long id_MT_Perfiles) {
        this.ID_MT_Perfiles = id_MT_Perfiles;
    }

    @JsonProperty("nombre_Usuario")
    public String getNombre() {
        return Nombre_Usuario;
    }

    @JsonProperty("nombre_Usuario")
    public void setNombre(String nombre_usuario) {
        Nombre_Usuario = nombre_usuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }
}
