
package com.Proyecto.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author mario
 */

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria; 
    private String nombre;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
    
    
    
}
