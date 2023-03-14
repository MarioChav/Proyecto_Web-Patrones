package com.Proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; //Transforma en id_cliente, hibernate lo hace
    String nombre;
    String apodo;
    String clave;
    Boolean activo;
    
    

    public Usuario() {
    }

    public Usuario(String nombre, String apodo, String clave, Boolean activo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.clave = clave;
        this.activo = activo;
    }

}
    
