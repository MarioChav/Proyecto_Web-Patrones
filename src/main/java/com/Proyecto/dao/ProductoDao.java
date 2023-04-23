
package com.Proyecto.dao;

import com.Proyecto.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
    
}
