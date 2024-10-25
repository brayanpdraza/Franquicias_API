package com.Brayan_Pedraza.API_Franquicias.controllers;
import com.Brayan_Pedraza.API_Franquicias.models.ProductosModel;
import com.Brayan_Pedraza.API_Franquicias.services.ProductosService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Productos")
public class ProductosController {
       @Autowired
       ProductosService ProductosService;

    @PostMapping("/guardarProducto")
    public ProductosModel guardarProducto(@RequestBody ProductosModel Producto) {
        
        return this.ProductosService.crearProducto(Producto);
    }
}
