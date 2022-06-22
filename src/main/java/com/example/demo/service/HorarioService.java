package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.HorarioEntity;
import com.example.demo.repository.HorarioRepository;

@Service

public class HorarioService {

	@Autowired
	HorarioRepository horario;
	
	public ArrayList<HorarioEntity> obtenerHorario(){
		return (ArrayList<HorarioEntity>)horario.findAll();
	}
	
	public HorarioEntity guardarHorario(HorarioEntity horarios) {
		return horario.save(horarios);
	}
	
	public Optional<HorarioEntity> obtenerPorId(Long id){
		return horario.findById(id);
	}
	
	public boolean eliminarHorario(Long id) {
		try {
			horario.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
