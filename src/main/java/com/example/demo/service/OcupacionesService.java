package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.OcupacionesEntity;
import com.example.demo.repository.OcupacionesRepository;

@Service

public class OcupacionesService {
	
	@Autowired
	OcupacionesRepository ocupacion;
	
	public ArrayList<OcupacionesEntity> obtenerOcupaciones(){
		return (ArrayList<OcupacionesEntity>)ocupacion.findAll();
	}
	
	public OcupacionesEntity guardarOcupaciones(OcupacionesEntity ocupaciones) {
		return ocupacion.save(ocupaciones);
	}
	
	public Optional<OcupacionesEntity> obtenerPorId(Long id){
		return ocupacion.findById(id);
	}
	
	public boolean eliminarOcupaciones(Long id) {
		try {
			ocupacion.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}

}
