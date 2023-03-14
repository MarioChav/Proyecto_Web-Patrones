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
@Table(name="cliente")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //Transforma en id_cliente, hibernate lo hace
    String nombre;
    String apellidos;
    String clave;
    String correo;
    String telefono;
    Boolean activo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String clave, String correo, String telefono, Boolean activo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
    }


}

