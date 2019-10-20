package com.drbotro.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController{

    @RequestMapping("/formularioRegistroAlumnos")
    public String formularioRegistroAlumnos(Model modelo){

        Alumno alumno = Alumno.builder().build();
        modelo.addAttribute("elAlumno", alumno);

        return "formularioRegistroAlumnos";
    }

}
