package com.Brayan_Pedraza.API_Franquicias.controllers;
import com.Brayan_Pedraza.API_Franquicias.models.SucursalModel;
import com.Brayan_Pedraza.API_Franquicias.services.SucursalService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Sucursal")
public class SucursalController {
    @Autowired
    SucursalService SucursalService;

    @PostMapping("/guardarSucursal")
    public SucursalModel guardarSucursal(@RequestBody SucursalModel sucursal) {
        
        return this.SucursalService.crearSucursal(sucursal);
    }
}
