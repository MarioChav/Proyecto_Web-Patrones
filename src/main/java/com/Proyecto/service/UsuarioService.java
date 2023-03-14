package com.Proyecto.service;

import com.Proyecto.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getCliente(Usuario usuario);
    
    public void save(Usuario usuario); //Sirve para insertar y modificar un registro
    
    public void delete(Usuario usuario);
    
}