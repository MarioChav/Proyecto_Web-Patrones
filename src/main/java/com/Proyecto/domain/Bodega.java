
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
@Table(name="bodega")
public class Bodega implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBodega;
    private String nombre;
    private boolean activo;

    public Bodega() {
    }

    public Bodega(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
    
    
}
