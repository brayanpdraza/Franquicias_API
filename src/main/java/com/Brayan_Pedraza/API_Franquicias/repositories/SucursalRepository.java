package com.Brayan_Pedraza.API_Franquicias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Brayan_Pedraza.API_Franquicias.models.SucursalModel;

@Repository
public interface SucursalRepository extends CrudRepository<SucursalModel,Long>{

    boolean existsByIdMTFranquiciasAndNombreSucursal(Long idMTFranquicias, String nombreSucursal);
}
