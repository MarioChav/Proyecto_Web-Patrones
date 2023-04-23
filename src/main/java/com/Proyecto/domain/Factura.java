package com.Proyecto.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="factura")
public class Factura implements Serializable{
    
  private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura; 
    private Long idProducto;
    private Long idCliente;
    private Long total;

    public Factura() {
    } 

    public Factura(Long idProducto, Long idCliente, Long total) {
        this.idProducto = idProducto;
        this.idCliente = idCliente;
        this.total = total;
    }

}
  
