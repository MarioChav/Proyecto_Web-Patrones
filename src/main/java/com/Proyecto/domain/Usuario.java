package com.Proyecto.domain;

import java.io.Serializable;
import javax.persistence.*;
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
    
