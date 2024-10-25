package com.Brayan_Pedraza.API_Franquicias.services;

import com.Brayan_Pedraza.API_Franquicias.models.Franquicia_Model;
import com.Brayan_Pedraza.API_Franquicias.repositories.FranquiciaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranquiciaService {
    @Autowired
    FranquiciaRepository FranquiciaRepository;

    public Franquicia_Model guardarFranquicia(Franquicia_Model franquicia)
    {
        List<Franquicia_Model> franquiciaExistente = FranquiciaRepository.findByNombreFranquicia(franquicia.getNombre_Franquicia());
        if (!franquiciaExistente.isEmpty()) {
            throw new RuntimeException("La franquicia con el nombre '" + franquicia.getNombre_Franquicia() + "' ya existe.");
        }
        return FranquiciaRepository.save(franquicia);

    }
}
