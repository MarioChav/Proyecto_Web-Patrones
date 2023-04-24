
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
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto; 
    private Long idCategoria;  
    private Long idBodega;  
    String nombre;
    String descripcion;
    private double precio;
    int cantidad;
    boolean activo;

    public Producto() {
    }

    public Producto(Long idCategoria, Long idBodega, String nombre, String descripcion, double precio, int cantidad, boolean activo) {
        this.idCategoria = idCategoria;
        this.idBodega = idBodega;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.activo = activo;
    }

    
    
    
    
}
