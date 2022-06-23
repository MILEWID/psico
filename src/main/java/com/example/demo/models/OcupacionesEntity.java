package com.example.demo.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="ocupacion")

public class OcupacionesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long idOcupacion;
	private String descripcion;
        
        @OneToMany(mappedBy = "idOcupacion")
        private List<PersonaEntity> idPersona;

	public Long getIdOcupacion() {
		return idOcupacion;
	}

	public void setIdOcupacion(Long idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

        public List<PersonaEntity> getIdPersona() {
            return idPersona;
        }

        public void setIdPersona(List<PersonaEntity> idPersona) {
            this.idPersona = idPersona;
        }
}
