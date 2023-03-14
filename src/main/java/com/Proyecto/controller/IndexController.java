package com.Proyecto.controller;

import com.Proyecto.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping("/usuarios")
    public String inicio(Model model) {
        
        var usuarios= usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        
        return "index";
    }
    
}
