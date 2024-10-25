package com.Brayan_Pedraza.API_Franquicias.controllers;

import com.Brayan_Pedraza.API_Franquicias.Dtos.FranqSucProdDto;
import com.Brayan_Pedraza.API_Franquicias.models.Franquicia_Model;
import com.Brayan_Pedraza.API_Franquicias.services.FranquiciaService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Franquicia")
public class FranquiciaController {
    @Autowired
    FranquiciaService FranquiciaService;

    @GetMapping("/con-sucursales-y-productos")
    public List<FranqSucProdDto> obtenerFranquiciasConSucursalesYProductos() 
    {
        return FranquiciaService.obtenerFranquiciasConSucursalesYProductos();
    }

    @PostMapping("/guardarFranquicia")
    public Franquicia_Model guardarFranquicia(@RequestBody Franquicia_Model franquicia) {
        
        return this.FranquiciaService.guardarFranquicia(franquicia);
    }
}
