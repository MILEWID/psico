package com.example.demo.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
public class generoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idGenero;
    private String descripcion;

    @OneToMany(mappedBy = "gen")
        private List<personaEntity>  persona;

    public generoEntity() {
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<personaEntity> getPersona() {
        return persona;
    }

    public void setPersona(List<personaEntity> persona) {
        this.persona = persona;
    }

    
    
}
