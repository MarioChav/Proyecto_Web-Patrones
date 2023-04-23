package com.Proyecto.service;


import com.Proyecto.dao.FacturaDao;
import com.Proyecto.domain.Factura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaServiceImpl implements FacturaService{
  
    @Autowired
    FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)    
    public List<Factura> getFacturas() {
        var lista= (List<Factura>)facturaDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Factura getFactura(Factura factura) {
        return facturaDao.findById(factura.getIdFactura()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Factura factura) {
        facturaDao.save(factura);
    }

}
