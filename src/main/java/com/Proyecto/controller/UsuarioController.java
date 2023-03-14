package com.Proyecto.controller;

import com.Proyecto.domain.Usuario;
import com.Proyecto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping("/usuario/listado")
    public String inicio(Model model) {
        var usuarios= usuarioService.getUsuarios(false);
        model.addAttribute("usuarios", usuarios);
        return "/usuario/listado";
    }
    
    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuario usuario){
        return "/usuario/modificar";
    }
    
    @PostMapping("/usuario/guardar")
    public String guardarUsuario(Usuario usuario){
        usuarioService.save(usuario);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/usuario/modificar/{idUsuario}")
    public String modificarUsuario(Usuario usuario, Model model){
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modificar";
    }
    
    @GetMapping("/usuario/eliminar/{idUsuario}")
    public String eliminarUsuario(Usuario usuario){
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    }
    
}
