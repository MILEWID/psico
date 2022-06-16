/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.personaEntity;
import com.example.demo.repository.personaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class personaService {
     @Autowired
	personaRepository rep;
	
	public ArrayList<personaEntity> obtenerPersona(){
		return (ArrayList<personaEntity> ) rep.findAll();
	}
	
	public personaEntity guardarPersona(personaEntity per) {
		return rep.save(per);
	}
        public Optional<personaEntity> obtenerPersonaiId(Long id) {
		return rep.findById(id);
	}
        public boolean eliminarPersona(Long id){
            try{
                rep.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
