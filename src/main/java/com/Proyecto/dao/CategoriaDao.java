
package com.Proyecto.dao;

import com.Proyecto.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mario
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
