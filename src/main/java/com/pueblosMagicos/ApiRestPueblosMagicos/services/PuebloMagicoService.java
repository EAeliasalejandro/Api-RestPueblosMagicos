package com.pueblosMagicos.ApiRestPueblosMagicos.services;

import com.pueblosMagicos.ApiRestPueblosMagicos.repositories.PuebloMagicoRepository;

import java.util.ArrayList;

import com.pueblosMagicos.ApiRestPueblosMagicos.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//2do Aquí se ejecuta la logica del negocio y se llama al repositorio para la conexión con la BD
@Service
public class PuebloMagicoService {
    @Autowired // etiqueta para no instanciar y usar como variable el repositorio
    PuebloMagicoRepository puebloMagicoRepository;

    public ArrayList<PuebloMagicoModel> ObtenerTodo() {
        return (ArrayList<PuebloMagicoModel>) puebloMagicoRepository.findAll();
    }

    // Servicio para obtener los pueblos magicos registrados en la base de datos apartir del estado
    public ArrayList<String> obtenerPueblosMagicos(String estado) {
        return puebloMagicoRepository.obtenerPueblosMagicos(estado);
    }


    // Servicio para obtener la latitud y longitud de un pueblo magico registrado en la base de datos
    public ArrayList<String> obtenerDireccionPuebloMagico(String pueblo) { 
        return puebloMagicoRepository.obtenerDireccionPuebloMagico(pueblo);
    }

}
