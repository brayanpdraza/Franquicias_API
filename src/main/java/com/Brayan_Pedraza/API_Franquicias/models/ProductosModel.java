package com.Brayan_Pedraza.API_Franquicias.models;
import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name="Productos")
public class ProductosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID_Productos" ,unique = true, nullable = false)
    private Long idProductos;
    @Column(name ="ID_MT_Sucursales")
    private Long idMTSucursales;
    @Column(name = "nombre_Producto")
    private String nombreProducto;
    @Column(name = "Stock")
    private BigDecimal stock;
    @Column(name = "ID_Creador")
    private Long iDCreador;
    @Column(name = "Fecha_Creador")
    private String fechaCreador;

    public Long getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Long idProductos) {
        this.idProductos = idProductos;
    }

    public Long getIdMTSucursales() {
        return idMTSucursales;
    }

    public void setIdMTSucursales(Long idMTSucursales) {
        this.idMTSucursales = idMTSucursales;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
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
}
