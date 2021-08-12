package com.spring.aula.springaula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Direciona {

    @RequestMapping("/index")
    public String appVai(Model model){
        model.addAttribute("mensagem", 10.5 + "Utilizando Modelo" );
        return "index";
    }
}
