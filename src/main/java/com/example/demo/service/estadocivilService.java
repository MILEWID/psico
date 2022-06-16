/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;


import com.example.demo.models.estadocivilEntity;
import com.example.demo.repository.especialidadRepository;
import com.example.demo.repository.estadocivilRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class estadocivilService {
     @Autowired
	estadocivilRepository esp;
	
	public ArrayList<estadocivilEntity> obtenerEstadoCivil(){
		return (ArrayList<estadocivilEntity> ) esp.findAll();
	}
	
	public estadocivilEntity guardarEstadocivil(estadocivilEntity estciv) {
		return esp.save(estciv);
	}
        public Optional<estadocivilEntity> obtenerEstadoCivilporid(Long id) {
		return esp.findById(id);
	}
        public boolean eliminarEstadoCivil(Long id){
            try{
                esp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
