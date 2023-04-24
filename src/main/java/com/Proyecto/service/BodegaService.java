
package com.Proyecto.service;

import com.Proyecto.domain.Bodega;
import java.util.List;

/**
 *
 * @author mario
 */


public interface BodegaService {
    
    public List<Bodega> getBodegas(boolean activos);  
    
    public Bodega getBodega(Bodega bodega);
    
    public void save(Bodega bodega);  
    
    public void delete(Bodega bodega);
    
}
