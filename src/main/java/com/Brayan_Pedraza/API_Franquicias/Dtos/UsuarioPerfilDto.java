package com.Brayan_Pedraza.API_Franquicias.Dtos;


public class UsuarioPerfilDto {

   private Long ID_Usuarios;
    
    private Long ID_MT_Franquicias;

    private Long ID_MT_Sucursales;
    private Long ID_MT_Perfiles;

    private Integer Jerarquia;

    private String Nombre_Perfil;
    private String Nombre_Usuario;
    private String Correo;
    private String Clave;

    public UsuarioPerfilDto(Long ID_Usuarios, Long ID_MT_Franquicias, Long ID_MT_Sucursales,
    Long ID_MT_Perfiles, Integer Jerarquia, String Nombre_Perfil,
    String Nombre_Usuario, String Correo, String Clave) {
    this.ID_Usuarios = ID_Usuarios;
    this.ID_MT_Franquicias = ID_MT_Franquicias;
    this.ID_MT_Sucursales = ID_MT_Sucursales;
    this.ID_MT_Perfiles = ID_MT_Perfiles;
    this.Jerarquia = Jerarquia;
    this.Nombre_Perfil = Nombre_Perfil;
    this.Nombre_Usuario = Nombre_Usuario;
    this.Correo = Correo;
    this.Clave = Clave;
    }

    public Long getId() {
        return ID_Usuarios;
    }

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

    public Integer getJerarquia() {
        return Jerarquia;
    }

    public void setJerarquia(Integer jerarquia) {
        Jerarquia = jerarquia;
    }

    public String getPerfil() {
        return Nombre_Perfil;
    }

    public void setPerfil(String perfil) {
        Nombre_Perfil = perfil;
    }

    public String getNombre() {
        return Nombre_Usuario;
    }

    public void setNombre(String nombre) {
        Nombre_Usuario = nombre;
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
