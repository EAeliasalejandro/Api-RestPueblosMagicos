package com.pueblosMagicos.ApiRestPueblosMagicos.controllers;

import java.util.ArrayList;

import com.pueblosMagicos.ApiRestPueblosMagicos.models.PuebloMagicoModel;
import com.pueblosMagicos.ApiRestPueblosMagicos.services.PuebloMagicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//1ero - Aqui se recibe la petición web y manda a llamar el servicio
@RestController
@RequestMapping("/pueblosMagicos")
public class PuebloMagicoController {
    @Autowired // etiqueta para no instanciar y usar como variable el repositorio
    PuebloMagicoService puebloMagicoService;
    
    @CrossOrigin(origins = "*")
    @GetMapping("/lista")
    public ArrayList<PuebloMagicoModel> obtenerDireccionPuebloMagico() {
        return puebloMagicoService.ObtenerTodo();
    }

    // Controlador llama al servicio obtenerPueblosMagicos(estado) y responde en
    // json
    @CrossOrigin(origins = "*")
    @GetMapping("/obtenerPueblos/{nombre_estado}")
    public ArrayList<String> obtenerPueblosMagicos(@PathVariable("nombre_estado") String nombre_estado) {
        ArrayList<String> pueblos = puebloMagicoService.obtenerPueblosMagicos(nombre_estado);
        if (pueblos.isEmpty() == true) {
            pueblos.add("No se encontró el estado solicitado");
            return pueblos;
        } else {
            return pueblos;
        }
    }

    // Controlador llama al servicio obtenerPueblosMagicos(estado) y responde en
    // json
    @CrossOrigin(origins = "*")
    @GetMapping("/obtenerDireccion/{nombre_pueblo}")
    public ArrayList<String> obtenerDireccionPuebloMagico(@PathVariable("nombre_pueblo") String nombre_pueblo) {
        ArrayList<String> direccion = puebloMagicoService.obtenerDireccionPuebloMagico(nombre_pueblo);
        if (direccion.isEmpty() == true) {
            direccion.add("No se encontró el pueblo mágico solicitado");
            return direccion;
        } else {
            return direccion;
        }
    }

    // Manejo de errores
    @CrossOrigin(origins = "*")
    @GetMapping("/obtenerPueblos/")
    public ArrayList<String>  obtenerPueblosMagicosError() {
        ArrayList<String> errorPueblos = new ArrayList<String>();
        errorPueblos.add("Selecciona el estado");
        return errorPueblos;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/obtenerDireccion/")
    public ArrayList<String> obtenerDireccionPuebloMagicoError() {
        ArrayList<String> errorDireccion = new ArrayList<String>();
        errorDireccion.add("Selecciona el Pueblo Mágico");
        return errorDireccion;
    }
}
