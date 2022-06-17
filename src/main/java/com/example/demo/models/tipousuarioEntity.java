package com.example.demo.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tipo_usuario")
public class tipousuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idTipo;
    private String descripcion;
     
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "administrador_id", referencedColumnName = "idAdministrador")
    private administradorEntity administrador;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asistente_id", referencedColumnName = "idAsistente")
    private asistenteEntity asistente;

    public asistenteEntity getAsistente() {
        return asistente;
    }

    public void setAsistente(asistenteEntity asistente) {
        this.asistente = asistente;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public administradorEntity getAdministrador() {
        return administrador;
    }

    public void setAdministrador(administradorEntity administrador) {
        this.administrador = administrador;
    }

   
   

}
