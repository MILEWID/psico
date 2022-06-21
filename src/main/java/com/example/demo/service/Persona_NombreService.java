/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Persona_NombreEntity;
import com.example.demo.repository.Persona_NombreRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
public class Persona_NombreService {
    @Autowired
	Persona_NombreRepository np;
	
	public ArrayList<Persona_NombreEntity> obtener(){
		return (ArrayList<Persona_NombreEntity> ) np.findAll();
	}
	
	public Persona_NombreEntity guardar(Persona_NombreEntity personaname) {
		return np.save(personaname);
	}
        public Optional<Persona_NombreEntity> obtenerPorId(Long id) {
		return np.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                np.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
