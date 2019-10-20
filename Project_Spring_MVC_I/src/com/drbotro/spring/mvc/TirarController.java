package com.drbotro.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarController{

    // 1. Pedir al servidor el formulario
    @RequestMapping("/peticionAlumnosFormulario")
    public String peticionAlumnosFormulario(){
        return "peticionAlumnosFormulario";
    }

    // 2. Procesar el formulario que hemos rellenado y añadiendo datos al modelo
    @RequestMapping("/procesarModeloAlumnosFormulario")
    public String procesarModeloAlumnosFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo){
        // 3. Capturar la información del formulario
        nombre += " Es el peor alumno.";
        String mensajeFinal = "¿Quien es el peor alumno? " + nombre;

        // 4. Agregamos info al modelo
        modelo.addAttribute("mensajeClaro", mensajeFinal);

        return "procesarModeloAlumnosFormulario";
    }

}
