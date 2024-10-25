package com.Brayan_Pedraza.API_Franquicias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Brayan_Pedraza.API_Franquicias.models.ProductosModel;

@Repository
public interface ProductosRepository extends CrudRepository<ProductosModel,Long> {
    boolean existsByIdMTSucursalesAndNombreProducto(Long idMTFranquicias, String nombreSucursal);

    boolean existsByIdProductos(Long idProdctos);

}
