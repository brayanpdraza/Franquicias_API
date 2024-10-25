package com.Brayan_Pedraza.API_Franquicias.repositories;

import com.Brayan_Pedraza.API_Franquicias.models.Franquicia_Model;
import com.Brayan_Pedraza.API_Franquicias.Dtos.*;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiciaRepository extends CrudRepository <Franquicia_Model,Long> {
    List<Franquicia_Model> findByNombreFranquicia(String nombre_Franquicia);

    @Query("SELECT new com.Brayan_Pedraza.API_Franquicias.Dtos.FranqSucProdDto(f.nombreFranquicia, s.nombreSucursal, p.nombreProducto, p.stock) " +
    "FROM Franquicia_Model f " +
    "LEFT JOIN f.Sucursal s " +
    "LEFT JOIN s.productos p " +
    "WHERE p.stock = (SELECT MAX(p2.stock) FROM ProductosModel p2 WHERE p2.Sucursal.idMTSucursales = s.idMTSucursales)")
List<FranqSucProdDto> findFranquiciasConSucursalYProductoMayorStock();
}
