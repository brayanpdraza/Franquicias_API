package com.Brayan_Pedraza.API_Franquicias.services;
import com.Brayan_Pedraza.API_Franquicias.models.SucursalModel;
import com.Brayan_Pedraza.API_Franquicias.repositories.SucursalRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;

    public void validarSucursal(Long idFranquicia, String nombreSucursal) {
        if (sucursalRepository.existsByIdMTFranquiciasAndNombreSucursal(idFranquicia, nombreSucursal)) {
            throw new IllegalArgumentException("La Sucursal con el nombre '" + nombreSucursal+ "' ya existe para la Franquicia a la que pertenece.");
        }
    }

    public SucursalModel crearSucursal(SucursalModel sucursal) {

        if (sucursal.getIdMTFranquicias() == null) {
            throw new IllegalArgumentException("La sucursal debe pertenecer a una franquicia.");
        }
        validarSucursal(sucursal.getIdMTFranquicias(), sucursal.getNombreSucursal());
        return sucursalRepository.save(sucursal);
    }
}
