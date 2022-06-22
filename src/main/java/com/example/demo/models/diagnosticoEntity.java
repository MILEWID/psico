
package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table (name = "diagnostico")
public class diagnosticoEntity {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long iddianogstico;
    private Long idcie;
    private String descripcion;
    private Long estado;

    public Long getIddianogstico() {
        return iddianogstico;
    }

    public void setIddianogstico(Long iddianogstico) {
        this.iddianogstico = iddianogstico;
    }

    public Long getIdcie() {
        return idcie;
    }

    public void setIdcie(Long idcie) {
        this.idcie = idcie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }
    
    
    
}