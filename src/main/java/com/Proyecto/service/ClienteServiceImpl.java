package com.Proyecto.service;

import com.Proyecto.dao.ClienteDao;
import com.Proyecto.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    ClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes(boolean activos) {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

}
