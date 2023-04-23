package com.Proyecto.service;

import com.Proyecto.domain.Factura;
import java.util.List;


public interface FacturaService {
    
    public List<Factura> getFacturas();   
    
    public Factura getFactura(Factura factura);
    
    public void save(Factura factura);  
    
}
