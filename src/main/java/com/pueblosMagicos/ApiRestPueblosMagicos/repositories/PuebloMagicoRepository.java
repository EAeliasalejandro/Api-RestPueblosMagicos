package com.pueblosMagicos.ApiRestPueblosMagicos.repositories;

import java.util.ArrayList;

import com.pueblosMagicos.ApiRestPueblosMagicos.models.PuebloMagicoModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//3ero El repositorio conecta con la base de datos y llama al modelo para saber que datos traer
@Repository
public interface PuebloMagicoRepository extends CrudRepository<PuebloMagicoModel, Integer> {

    //Conexión para ejecutar un procedimiento
    @Query(value = "{call obtenerPueblosMagicos(:nombre_estado)}", nativeQuery = true)
    ArrayList<String> obtenerPueblosMagicos(@Param("nombre_estado") String nombre_estado);

    @Query(value = "{call obtenerDireccionPuebloMagico(:nombre_pueblo)}", nativeQuery = true)
    ArrayList<String> obtenerDireccionPuebloMagico(@Param("nombre_pueblo") String nombre_pueblo);

}
