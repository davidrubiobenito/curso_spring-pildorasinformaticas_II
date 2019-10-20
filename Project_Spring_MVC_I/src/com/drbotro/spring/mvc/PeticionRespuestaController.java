package com.drbotro.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeticionRespuestaController{

    // 1. Pedir al servidor el formulario
    @RequestMapping("/peticionAlumnosFormulario")
    public String peticionAlumnosFormulario(){
        return "peticionAlumnosFormulario";
    }

    // 2. Procesar el formulario que hemos rellenado y mandado
    @RequestMapping("/procesarAlumnosFormulario")
    public String procesarAlumnosFormulario(){
        return "procesarAlumnosFormulario";
    }

    // 2. Procesar el formulario que hemos rellenado y añadiendo datos al modelo
    @RequestMapping("/procesarModeloAlumnosFormulario")
    public String procesarModeloAlumnosFormulario(HttpServletRequest request, Model modelo){

        // 3. Capturar la información del formulario
        String nombre = request.getParameter("nombreAlumno");
        nombre += " Es el mejor alumno.";
        String mensajeFinal = "¿Quien es el mejor alumno? " + nombre;

        // 4. Agregamos info al modelo
        modelo.addAttribute("mensajeClaro", mensajeFinal);

        return "procesarModeloAlumnosFormulario";
    }

}
