package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

@Table(name="cita",uniqueConstraints={
    @UniqueConstraint(columnNames = {"createDate", "hora"})
} )

public class CitaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	
	private Long idCita;
	
       
	
	@ManyToOne
	@JoinColumn(name="idPersona")
	private PersonaEntity idPersona;
        
        	
	
 @JsonFormat(pattern="yyyy-MM-dd")
    private Date createDate;
	
    private String hora;

	public Long getIdCita() {
		return idCita;
	}
	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}


        
	public PersonaEntity getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(PersonaEntity idPersona) {
		this.idPersona = idPersona;
	}

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


	
	

}
