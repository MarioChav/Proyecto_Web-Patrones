package com.Proyecto.dao;

import com.Proyecto.domain.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaDao extends CrudRepository<Factura, Long>{
    
}
