package com.Brayan_Pedraza.API_Franquicias.controllers;

import java.util.List;

import com.Brayan_Pedraza.API_Franquicias.models.UsuarioModel;
import com.Brayan_Pedraza.API_Franquicias.Dtos.*;
import com.Brayan_Pedraza.API_Franquicias.services.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService UsuarioService;
    
    @GetMapping("/obtenerUsuariosInnerPerfil")
    public List<UsuarioPerfilDto> obtenerUsuariosInnerPerfil() {
        return UsuarioService.obtenerUsuariosInnerPerfil();
    }
    
    @PostMapping("/guardarUsuario")
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        
        return this.UsuarioService.guardarUsuario(usuario);
    }
    
}
