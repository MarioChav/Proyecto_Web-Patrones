package com.Proyecto.controller;

import com.Proyecto.domain.Factura;
import com.Proyecto.domain.Producto;
import com.Proyecto.service.ClienteService;
import com.Proyecto.service.FacturaService;
import com.Proyecto.service.ProductoService;
import com.Proyecto.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FacturaController {
    
    @Autowired
    FacturaService facturaService; 
    
    @Autowired
    ProductoService productoService; 
    
    @Autowired
    ClienteService clienteService; 
    
    @RequestMapping("/factura/listado")
    public String inicio(Model model) {
        var facturas = facturaService.getFacturas();
        model.addAttribute("facturas", facturas);
        return "/factura/listado"; 
    }
    
    @GetMapping("/factura/nueva") 
    public String nuevaFactura(Factura factura, Model model){
        var clientes = clienteService.getClientes(true);
        model.addAttribute("clientes", clientes );
        var productos = productoService.getProductos(true);
        model.addAttribute("productos", productos );
        return "/factura/nueva";
    }
    
    @PostMapping("/factura/guardar")
    public String guardarFactura(Factura factura){
        facturaService.save(factura);
        return "redirect:/factura/listado";
    }

}
