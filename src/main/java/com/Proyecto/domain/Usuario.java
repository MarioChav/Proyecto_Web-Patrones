package com.Proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; //Transforma en id_cliente, hibernate lo hace
    String nombre;
    String nombreUsuario;
    String clave;
    Boolean activo;
    
    private Usuario usuario;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String nombreUsuario, String clave, Boolean activo, Usuario usuario) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
        this.usuario = usuario;
    }
}
    
