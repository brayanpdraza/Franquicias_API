package com.Brayan_Pedraza.API_Franquicias.models;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="MT_Sucursales")
public class SucursalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID_MT_Sucursales" ,unique = true, nullable = false)
    private Long idMTSucursales;
    @Column(name = "ID_MT_Franquicias")
    private Long idMTFranquicias;
    @Column(name = "nombre_Sucursal")
    private String nombreSucursal;
    @Column(name = "ID_Creador")
    private Long iDCreador;
    @Column(name = "Fecha_Creador")
    private String fechaCreador;
    @Column(name = "ID_Modif")
    private Long iDModif;
    @Column(name = "Fecha_Modif")
    private String fechaModif;
    @Column(name = "ID_Eliminador")
    private Long iDEliminador;
    @Column(name = "Fecha_Eliminador")
    private String fechaEliminador;

    @ManyToOne
    @JoinColumn(name = "ID_MT_Franquicias", insertable = false, updatable = false)
    private Franquicia_Model Franquicia;

    @OneToMany
    @JoinColumn(name = "ID_MT_Sucursales", insertable = false, updatable = false)
    private List<ProductosModel> productos;

    public Long getIdMTSucursales() {
        return idMTSucursales;
    }

    public void setIdMTSucursales(Long idMTSucursales) {
        this.idMTSucursales = idMTSucursales;
    }

    public Long getIdMTFranquicias() {
        return idMTFranquicias;
    }

    public void setIdMTFranquicias(Long idMTFranquicias) {
        this.idMTFranquicias = idMTFranquicias;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public Long getIDCreador() {
        return iDCreador;
    }

    public void setIDCreador(Long iDCreador) {
        this.iDCreador = iDCreador;
    }

    public String getFechaCreador() {
        return fechaCreador;
    }

    public void setFechaCreador(String fechaCreador) {
        this.fechaCreador = fechaCreador;
    }

    public Long getIDModif() {
        return iDModif;
    }

    public void setIDModif(Long iDModif) {
        this.iDModif = iDModif;
    }

    public String getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(String fechaModif) {
        this.fechaModif = fechaModif;
    }

    public Long getIDEliminador() {
        return iDEliminador;
    }

    public void setIDEliminador(Long iDEliminador) {
        this.iDEliminador = iDEliminador;
    }

    public String getFechaEliminador() {
        return fechaEliminador;
    }

    public void setFechaEliminador(String fechaEliminador) {
        this.fechaEliminador = fechaEliminador;
    }
}
