
package com.Proyecto.controller;

import com.Proyecto.domain.Bodega;
import com.Proyecto.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mario
 */

@Controller
public class BodegaController {
    
    @Autowired
    BodegaService bodegaService;
    
    @RequestMapping("/bodega/listado")
    public String inicio(Model model) {
        var bodegas = bodegaService.getBodegas(false);
        model.addAttribute("bodegas", bodegas);
        
        return "/bodega/listado";
    }
    
    @GetMapping("/bodega/nuevo")
    public String nuevoBodega(Bodega bodega){
        return "/bodega/modificar";
    }
    
    @PostMapping("/bodega/guardar")
    public String guardarBodega(Bodega bodega){
        bodegaService.save(bodega);
        return "redirect:/bodega/listado";
    }
    
    @GetMapping("/bodega/modificar/{idBodega}")
    public String modificarBodega(Bodega bodega, Model model){
        bodega = bodegaService.getBodega(bodega);
        model.addAttribute("bodega", bodega);
        return "/bodega/modificar";
    }
    
    @GetMapping("/bodega/eliminar/{idBodega}")
    public String eliminarBodega(Bodega bodega){
        bodegaService.delete(bodega);
        return "redirect:/bodega/listado";
    }
    
    
}
