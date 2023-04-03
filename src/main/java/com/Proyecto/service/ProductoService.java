
package com.Proyecto.service;

import com.Proyecto.domain.Producto;
import java.util.List;

/**
 *
 * @author mario
 */
public interface ProductoService {
    
    public List<Producto> getProductos(boolean activos);  
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);  
    
    public void delete(Producto producto);
    
}
