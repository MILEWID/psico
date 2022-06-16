/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "seguimiento")
public class seguimientoEntity {
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long id;
	private Date fecha;
	private String descripcion;
        
        @ManyToOne
        @JoinColumn(name = "id_histcli")
        private historia_clinicaEntity histcli;

    public seguimientoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
<<<<<<< HEAD
=======

    public historia_clinicaEntity getHiscli() {
        return hiscli;
    }
>>>>>>> 0610fe3b22102befb52b2f386fdc1347022ac71f

    

    public historia_clinicaEntity getHistcli() {
        return histcli;

      
    }
<<<<<<< HEAD
        
        
=======
       
>>>>>>> 0610fe3b22102befb52b2f386fdc1347022ac71f
}
