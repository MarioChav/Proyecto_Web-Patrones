package com.Proyecto.service;

import com.Proyecto.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    public List<Cliente> getClientes(boolean activos);
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente); //Sirve para insertar y modificar un registro
    
    public void delete(Cliente cliente);
    
}

