/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "historia_clinica")


public class Historia_ClinicaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idHistoriaClinica;
    private Long idAnamnesis;
    private Long idCita;
    private Long idFuncionPsiquica;
    private Long idHistoraSocial;
    @OneToMany(mappedBy = "historiacli")
    private List<diagnosticoEntity> idDiagnostico;
    
    @OneToMany(mappedBy = "historiaclin")
    private List<planesEntity> idPlan;

	@OneToMany(mappedBy = "historiaclini")
    private List<Historia_EnfermedadEntity> idHistoriaEnfermedad;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    private PersonaEntity idPersona;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHistoriaLaboral", referencedColumnName = "idHistoriaLaboral")
    private Historia_LaboralEntity idHistoriaLaboral;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHistoriaSocial", referencedColumnName = "idHistoriaSocial")
    private Historia_SocialEntity idHistoriaSocial;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idGrupoFamiliar", referencedColumnName = "idGrupoFamiliar")
    private Grupo_FamiliarEntity idGrupoFamiliar;
    
    private String referencia;
    private String transtorno;
    private String alergia;
    private String conflicto;
    private String atencionPrevia;

    
    public void setIdHistoriaEnfermedad(List<Historia_EnfermedadEntity> idHistoriaEnfermedad) {
		this.idHistoriaEnfermedad = idHistoriaEnfermedad;
	}
    
    public Long getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Long idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public List<Historia_EnfermedadEntity> getIdHistoriaEnfermedad() {
		return idHistoriaEnfermedad;
	}

	public Long getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(Long idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
    }

    public Historia_LaboralEntity getIdHistoriaLaboral() {
		return idHistoriaLaboral;
	}

	public void setIdHistoriaLaboral(Historia_LaboralEntity idHistoriaLaboral) {
		this.idHistoriaLaboral = idHistoriaLaboral;
	}

	public Historia_SocialEntity getIdHistoriaSocial() {
		return idHistoriaSocial;
	}

	public void setIdHistoriaSocial(Historia_SocialEntity idHistoriaSocial) {
		this.idHistoriaSocial = idHistoriaSocial;
	}

	public Grupo_FamiliarEntity getIdGrupoFamiliar() {
		return idGrupoFamiliar;
	}

	public void setIdGrupoFamiliar(Grupo_FamiliarEntity idGrupoFamiliar) {
		this.idGrupoFamiliar = idGrupoFamiliar;
	}

	public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public Long getIdFuncionPsiquica() {
        return idFuncionPsiquica;
    }

    public void setIdFuncionPsiquica(Long idFuncionPsiquica) {
        this.idFuncionPsiquica = idFuncionPsiquica;
    }

    public Long getIdHistoraSocial() {
        return idHistoraSocial;
    }

    public void setIdHistoraSocial(Long idHistoraSocial) {
        this.idHistoraSocial = idHistoraSocial;
    }

    public List<diagnosticoEntity> getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(List<diagnosticoEntity> idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public List<planesEntity> getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(List<planesEntity> idPlan) {
        this.idPlan = idPlan;
    }

    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTranstorno() {
        return transtorno;
    }

    public void setTranstorno(String transtorno) {
        this.transtorno = transtorno;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getConflicto() {
        return conflicto;
    }

    public void setConflicto(String conflicto) {
        this.conflicto = conflicto;
    }

    public String getAtencionPrevia() {
        return atencionPrevia;
    }

    public void setAtencionPrevia(String atencionPrevia) {
        this.atencionPrevia = atencionPrevia;
    }

  
    
    
}
