
package com.example.demo.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    private String descripcion;
    private Long estado;
    
    @ManyToOne
    @JoinColumn(name = "id_histcli")
    private Historia_ClinicaEntity historiacli;
    
    @ManyToOne
    @JoinColumn(name = "id_cie")
    private cieEntity cie;

    public Long getIddianogstico() {
        return iddianogstico;
    }

    public void setIddianogstico(Long iddianogstico) {
        this.iddianogstico = iddianogstico;
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

    public Historia_ClinicaEntity getHistoriacli() {
        return historiacli;
    }

    public void setHistoriacli(Historia_ClinicaEntity historiacli) {
        this.historiacli = historiacli;
    }

    public cieEntity getCie() {
        return cie;
    }

    public void setCie(cieEntity cie) {
        this.cie = cie;
    }
    

   

}
