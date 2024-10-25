package com.Brayan_Pedraza.API_Franquicias.services;
import com.Brayan_Pedraza.API_Franquicias.models.ProductosModel;
import com.Brayan_Pedraza.API_Franquicias.repositories.ProductosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {
        @Autowired
    private ProductosRepository ProductosRepository;

    public Optional<ProductosModel> ConsultarProductoId(Long idProductos){
        
        return ProductosRepository.findById(idProductos);
    }

    public void validarProducto(Long idSucursal, String nombreProducto) {
        if (ProductosRepository.existsByIdMTSucursalesAndNombreProducto(idSucursal, nombreProducto)) {
            throw new IllegalArgumentException("El Producto con el nombre '" + nombreProducto+ "' ya existe para la Sucursal a la que pertenece.");
        }
    }
    public Optional<ProductosModel> validarExistenciaProducto(Long idProducto) {
        if (idProducto == null) {
            throw new IllegalArgumentException("Debe Enviar el ID del Producto.");
        }
        if (!ProductosRepository.existsByIdProductos(idProducto)) {
            throw new IllegalArgumentException("El Producto con id '" + idProducto+ "' No se encuentra Registrado.");
        }

        return ConsultarProductoId(idProducto);
    }

    public ProductosModel crearProducto(ProductosModel producto) {

        if (producto.getIdMTSucursales() == null) {
            throw new IllegalArgumentException("El producto debe pertenecer a una Sucursal.");
        }
        
        validarProducto(producto.getIdMTSucursales(), producto.getNombreProducto());
        return ProductosRepository.save(producto);
    }

    public ProductosModel ModificarNombreProducto(Long IdProducto,String NombreProducto)
     {
        Optional<ProductosModel> productoOptional = validarExistenciaProducto(IdProducto);
        ProductosModel producto = productoOptional.get();   
        if(NombreProducto == producto.getNombreProducto()){
            throw new IllegalArgumentException("El nombre ingresado ya se encuentra asignado al producto.");
        }     
        validarProducto(producto.getIdMTSucursales(), NombreProducto);

        producto.setNombreProducto(NombreProducto);
    
        return ProductosRepository.save(producto);
    }
}
