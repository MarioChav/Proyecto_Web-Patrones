
package com.Proyecto.service;

import com.Proyecto.dao.BodegaDao;
import com.Proyecto.domain.Bodega;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mario
 */

@Service
public class BodegaServiceImpl implements BodegaService{
    
    @Autowired
    BodegaDao bodegaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Bodega> getBodegas(boolean activos) {
        
        var lista= (List<Bodega>)bodegaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
        
    }

    @Override
    @Transactional(readOnly = true)
    public Bodega getBodega(Bodega bodega) {
        return bodegaDao.findById(bodega.getIdBodega()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Bodega bodega) {
        bodegaDao.save(bodega);
    }

    @Override
    @Transactional
    public void delete(Bodega bodega) {
        bodegaDao.deleteById(bodega.getIdBodega());
    }
    
}
