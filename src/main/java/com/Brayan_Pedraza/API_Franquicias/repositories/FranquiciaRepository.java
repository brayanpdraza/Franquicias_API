package com.Brayan_Pedraza.API_Franquicias.repositories;

import com.Brayan_Pedraza.API_Franquicias.models.Franquicia_Model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiciaRepository extends CrudRepository <Franquicia_Model,Long> {
    List<Franquicia_Model> findByNombreFranquicia(String nombre_Franquicia);
}
