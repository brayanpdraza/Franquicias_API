package com.Brayan_Pedraza.API_Franquicias.repositories;

import com.Brayan_Pedraza.API_Franquicias.Dtos.UsuarioPerfilDto;
import com.Brayan_Pedraza.API_Franquicias.models.UsuarioModel;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{
  
    /*@Query("SELECT u,p.Nombre_Perfil,p.Jerarquia FROM UsuarioModel u LEFT JOIN u.Perfiles p")*/
    @Query("SELECT new com.Brayan_Pedraza.API_Franquicias.Dtos.UsuarioPerfilDto(u.ID_Usuarios, u.ID_MT_Franquicias, u.ID_MT_Sucursales, u.ID_MT_Perfiles, p.Jerarquia, p.Nombre_Perfil, u.Nombre_Usuario, u.Correo, u.Clave) " +
       "FROM UsuarioModel u LEFT JOIN u.Perfiles p")
    List<UsuarioPerfilDto> findAllJoinPerfiles();
}
