package com.drbotro.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFirst{

    @RequestMapping
    public String muestraPagina(){
        return "pageFirst";
    }

}
