package com.Brayan_Pedraza.API_Franquicias.models;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="MT_Franquicias")
public class Franquicia_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID_MT_Franquicias;
    @Column(name = "nombre_Franquicia")
    private String nombreFranquicia;
    @Column
    private Long ID_Creador;
    @Column
    private String Fecha_Creador;
    @Column
    private Long ID_Modif;
    @Column
    private String Fecha_Modif;
    @Column
    private Long ID_Eliminador;
    @Column
    private String Fecha_Eliminador;

    @OneToMany
    @JoinColumn(name = "ID_MT_Franquicias", insertable = false, updatable = false)
    private List<SucursalModel> Sucursal;
    
    public Long getId_MT_Franquicias() {
        return ID_MT_Franquicias;
    }

    public void setId_MT_Franquicias(Long id_MT_Franquicias) {
        this.ID_MT_Franquicias = id_MT_Franquicias;
    }
    public String getNombre_Franquicia() {
        return nombreFranquicia;
    }
    public void setNombre_Franquicia(String nombre_franquicia) {
        nombreFranquicia = nombre_franquicia;
    }

    public Long getId_Creador() {
        return ID_Creador;
    }

    public void setId_Creador(Long id_Creador) {
        this.ID_Creador = id_Creador;
    }
  
    public String getFecha_Creador() {
        return Fecha_Creador;
    }

    public void setFecha_Creador(String fecha_Creador) {
        this.Fecha_Creador = fecha_Creador;
    }

    
    public Long getId_Modif() {
        return ID_Modif;
    }

    public void setId_Modif(Long id_Modif) {
        this.ID_Modif = id_Modif;
    }
 
    public String getFecha_Modif() {
        return Fecha_Modif;
    }

    public void setFecha_Modif(String fecha_Modif) {
        this.Fecha_Modif = fecha_Modif;
    }

    public Long getId_Eliminador() {
        return ID_Eliminador;
    }

    public void setId_Eliminador(Long id_Eliminador) {
        this.ID_Eliminador = id_Eliminador;
    }
    
    public String getFecha_Eliminador() {
        return Fecha_Eliminador;
    }

    public void setFecha_Eliminador(String fecha_Eliminador) {
        this.Fecha_Eliminador = fecha_Eliminador;
    }

}
