package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CitaMedicaEntity;
import com.example.demo.repository.citaMedicaRepository;

@Service

public class citaMedicaService {
	@Autowired

	citaMedicaRepository citaMedicaRepository;
	
	public ArrayList<CitaMedicaEntity> obtenerCitaMedica(){
		return (ArrayList<CitaMedicaEntity>)citaMedicaRepository.findAll();
	}
	
	public CitaMedicaEntity guardarCitaMedica(CitaMedicaEntity citaMedica) {
		return citaMedicaRepository.save(citaMedica);
	}
	
	public Optional<CitaMedicaEntity> obtenerCitaMedicaPorId(Long id){
		return citaMedicaRepository.findById(id);
	}
	
	public boolean eliminarCitaMedica(Long id) {
		try {
			citaMedicaRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
