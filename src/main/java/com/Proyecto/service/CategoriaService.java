
package com.Proyecto.service;

import com.Proyecto.domain.Categoria;
import java.util.List;

/**
 *
 * @author mario
 */

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);  
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);  
    
    public void delete(Categoria categoria);
    
}
