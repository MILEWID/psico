package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="cita_medica")
public class CitaMedicaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	private Long idCitaMedica;
        
         @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "horario_id", referencedColumnName = "idHorario")
        private horarioEntity horario;
	
	@ManyToOne
	@JoinColumn(name = "idMedico")
	private medicoEntity medico;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private pacienteEntity paciente;

    public Long getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(Long idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public horarioEntity getHorario() {
        return horario;
    }

    public void setHorario(horarioEntity horario) {
        this.horario = horario;
    }

    

    public medicoEntity getMedico() {
        return medico;
    }

    public void setMedico(medicoEntity medico) {
        this.medico = medico;
    }

    public pacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(pacienteEntity paciente) {
        this.paciente = paciente;
    }

    
	
	
	
	
	
	
	
	
}
