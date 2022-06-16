package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.alergiaRepository;
import com.example.demo.models.alergiaEntity;

@Service

public class alergiaService {
	
	@Autowired
	
	alergiaRepository alergiaRepository;
	
	public ArrayList<alergiaEntity> obtenerAlergia(){
		return (ArrayList<alergiaEntity>)alergiaRepository.findAll();
	}
	
	public alergiaEntity guardarAlergia(alergiaEntity alergia) {
		return alergiaRepository.save(alergia);
	}
	
	public Optional<alergiaEntity> obtenerAlergiaPorId(Long id){
		return alergiaRepository.findById(id);
	}
	
	public boolean eliminarAlergia(Long id) {
		try {
			alergiaRepository.deleteById(id);
			return true;
		}catch(Exception err){
			return false;
		}
	}

}
