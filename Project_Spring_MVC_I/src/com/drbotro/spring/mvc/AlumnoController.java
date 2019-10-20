package com.drbotro.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController{

    @RequestMapping("/formularioRegistroAlumnos")
    public String formularioRegistroAlumnos(Model modelo){

        final Alumno alumno = new Alumno();
        modelo.addAttribute("elAlumno", alumno);

        return "formularioRegistroAlumnos";
    }

    @RequestMapping("/procesarFormularioRegistroAlumnos")
    public String procesarFormularioRegistroAlumnos(@ModelAttribute("elAlumno") Alumno elAlumno){

        return "procesarFormularioRegistroAlumnos";
    }

}
