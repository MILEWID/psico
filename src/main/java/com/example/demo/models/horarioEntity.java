package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

import com.example.demo.models.CitaMedicaEntity;
import javax.persistence.CascadeType;

@Entity
@Table(name="horario")

public class horarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	
	private Long idHorario;
	
	
	
	@OneToOne(mappedBy="horario")	
	private CitaMedicaEntity  citaMedica;
	
	 @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico_id", referencedColumnName = "idMedico")
        private medicoEntity idMedico;
	
	private Long idEstado;

    public Long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Long idHorario) {
        this.idHorario = idHorario;
    }

    public CitaMedicaEntity getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedicaEntity citaMedica) {
        this.citaMedica = citaMedica;
    }

    public medicoEntity getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(medicoEntity idMedico) {
        this.idMedico = idMedico;
    }

   

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
	
	
	

}
