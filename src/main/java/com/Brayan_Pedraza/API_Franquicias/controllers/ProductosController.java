package com.Brayan_Pedraza.API_Franquicias.controllers;
import com.Brayan_Pedraza.API_Franquicias.models.ProductosModel;
import com.Brayan_Pedraza.API_Franquicias.services.ProductosService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/Productos")
public class ProductosController {
       @Autowired
       ProductosService ProductosService;

    @PostMapping("/guardarProducto")
    public ProductosModel guardarProducto(@RequestBody ProductosModel Producto) {
        
        return this.ProductosService.crearProducto(Producto);
    }

 @PutMapping("/ModificarNombreProducto/{id}/{nombre}")
public ProductosModel ModificarNombreProducto(@PathVariable("id") Long idProducto, @PathVariable("nombre") String nuevoNombre) {

    ProductosModel productoActualizado = this.ProductosService.ModificarNombreProducto(idProducto, nuevoNombre);
    return productoActualizado;

    }
}
