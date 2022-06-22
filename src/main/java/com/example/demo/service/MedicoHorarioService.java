package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.MedicoHorarioEntity;
import com.example.demo.repository.MedicoHorarioRepository;

@Service

public class MedicoHorarioService {
	
	@Autowired
	MedicoHorarioRepository medicohorario;
	
	public ArrayList<MedicoHorarioEntity> obtenerMedicoHorario(){
		return (ArrayList<MedicoHorarioEntity>)medicohorario.findAll();
	}
	
	public MedicoHorarioEntity guardarMedicoHorario(MedicoHorarioEntity medicohorarios) {
		return medicohorario.save(medicohorarios);
	}
	
	public Optional<MedicoHorarioEntity> obtenerPorId(Long id){
		return medicohorario.findById(id);
	}
	
	public boolean eliminarMedicoHorario(Long id) {
		try {
			medicohorario.deleteById(id);
			return true;
		}catch (Exception err) {
			return false;
		}
	}

}
