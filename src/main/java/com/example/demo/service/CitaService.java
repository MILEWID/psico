package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CitaEntity;
import com.example.demo.repository.CitaRepository;

@Service

public class CitaService {
	
	@Autowired
	CitaRepository cita;
	
	public ArrayList<CitaEntity> obtenerCita(){
		return (ArrayList<CitaEntity>)cita.findAll();
	}
	
	public CitaEntity guardarCita(CitaEntity citas) {
		return cita.save(citas);
	}
	
	public Optional<CitaEntity> obtenerPorId(Long id){
		return cita.findById(id);
	}
	
	public boolean eliminarCita(Long id) {
		try {
			cita.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
	
	public boolean verificarCita(Long id) {
		try {
			cita.findById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}

}
