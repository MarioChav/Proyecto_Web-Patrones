
package com.Proyecto.dao;

import com.Proyecto.domain.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mario
 */
public interface ProductoDao extends CrudRepository<Producto, Long> {
    
}
