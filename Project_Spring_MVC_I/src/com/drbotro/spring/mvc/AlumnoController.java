package com.drbotro.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController{

    @InitBinder
    public void miBinder(WebDataBinder binder){
        StringTrimmerEditor recortaEspaciosEnBlanco = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, recortaEspaciosEnBlanco);
    }

    @RequestMapping("/registroAlumno")
    public String formularioRegistroAlumnos(Model modelo){

        final Alumno alumno = new Alumno();
        modelo.addAttribute("elAlumno", alumno);

        return "registroAlumno";
    }

    @RequestMapping("/confirmarAlumno")
    public String procesarFormularioRegistroAlumnos(@Valid @ModelAttribute("elAlumno") Alumno elAlumno,
            BindingResult resultadovalidacion){

        String sFormulario = "";

        if(resultadovalidacion.hasErrors()){
            sFormulario = "registroAlumno";
        }else{
            sFormulario = "confirmarAlumno";
        }

        return sFormulario;
    }

}
