package com.Brayan_Pedraza.API_Franquicias.services;

import com.Brayan_Pedraza.API_Franquicias.models.UsuarioModel;
import com.Brayan_Pedraza.API_Franquicias.repositories.UsuarioRepository;
import com.Brayan_Pedraza.API_Franquicias.Dtos.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository UsuarioRepository;

    public List<UsuarioPerfilDto> obtenerUsuariosInnerPerfil() {
        return UsuarioRepository.findAllJoinPerfiles();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario)
    {
        return UsuarioRepository.save(usuario);
    }
}
