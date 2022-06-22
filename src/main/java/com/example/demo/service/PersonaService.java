/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.PersonaEntity;
import com.example.demo.repository.PersonaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class PersonaService {
    @Autowired
	PersonaRepository person;
	
	public ArrayList<PersonaEntity> obtener(){
		return (ArrayList<PersonaEntity> ) person.findAll();
	}
	
	public PersonaEntity guardar(PersonaEntity per) {
		return person.save(per);
	}
        public Optional<PersonaEntity> obtenerPorId(Long id) {
		return person.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                person.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
