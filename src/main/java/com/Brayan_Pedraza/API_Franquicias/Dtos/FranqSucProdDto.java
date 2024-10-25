package com.Brayan_Pedraza.API_Franquicias.Dtos;

import java.math.BigDecimal;

public class FranqSucProdDto {

    private String nombreFranquicia;
    private String nombreSucursal;
    private String nombreProducto;
    private BigDecimal stock;

    // Constructor
    public FranqSucProdDto(String nombreFranquicia, String nombreSucursal, String nombreProducto, BigDecimal stock) {
        this.nombreFranquicia = nombreFranquicia;
        this.nombreSucursal = nombreSucursal;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
    }

    // Getters y Setters
    public String getNombreFranquicia() {
        return nombreFranquicia;
    }

    public void setNombreFranquicia(String nombreFranquicia) {
        this.nombreFranquicia = nombreFranquicia;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
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
}
