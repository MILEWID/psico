package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.tratamientoRepository;
import com.example.demo.models.tratamientoEntity;

@Service

public class tratamientoService {
	
	@Autowired
	
	tratamientoRepository tratamientoRepository;
	
	public ArrayList<tratamientoEntity> obtenerTratamiento(){
		return (ArrayList<tratamientoEntity>)tratamientoRepository.findAll();
	}
	
	public tratamientoEntity guardarTratamiento(tratamientoEntity tratamiento) {
		return tratamientoRepository.save(tratamiento);
	}
	
	public Optional<tratamientoEntity> obtenerTratamientoPorId(Long id){
		return tratamientoRepository.findById(id);
	}
	
	public boolean eliminarTratamiento(Long id) {
		try {
			tratamientoRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}

}
