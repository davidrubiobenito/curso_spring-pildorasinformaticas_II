package com.drbotro.spring.mvc;

import org.springframework.stereotype.Controller;
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

}
