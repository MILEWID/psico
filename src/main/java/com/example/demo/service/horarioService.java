package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.horarioEntity;
import com.example.demo.repository.horarioRepository;

@Service

public class horarioService {
	
	@Autowired
	
	horarioRepository horarioRepository;
	
	public ArrayList<horarioEntity> obtenerHorario(){
		return (ArrayList<horarioEntity>)horarioRepository.findAll();
	}
	
	public horarioEntity guardarHorario(horarioEntity horario) {
		return horarioRepository.save(horario);
	}
	
	public Optional<horarioEntity> obtenerHorarioPorId(Long id){
		return horarioRepository.findById(id);
	}
	
	public boolean eliminarHorario(Long id) {
		try {
			horarioRepository.deleteById(id);
			return true;
		}catch(Exception err){
			return false;
		}
	}

}
