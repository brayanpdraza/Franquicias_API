package com.Brayan_Pedraza.API_Franquicias.services;
import com.Brayan_Pedraza.API_Franquicias.models.ProductosModel;
import com.Brayan_Pedraza.API_Franquicias.repositories.ProductosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {
        @Autowired
    private ProductosRepository ProductosRepository;

    public void validarProducto(Long idSucursal, String nombreProducto) {
        if (ProductosRepository.existsByIdMTSucursalesAndNombreProducto(idSucursal, nombreProducto)) {
            throw new IllegalArgumentException("El Producto con el nombre '" + nombreProducto+ "' ya existe para la Sucursal a la que pertenece.");
        }
    }

    public ProductosModel crearProducto(ProductosModel producto) {

        if (producto.getIdMTSucursales() == null) {
            throw new IllegalArgumentException("El producto debe pertenecer a una Sucursal.");
        }
        validarProducto(producto.getIdMTSucursales(), producto.getNombreProducto());
        return ProductosRepository.save(producto);
    }
}
