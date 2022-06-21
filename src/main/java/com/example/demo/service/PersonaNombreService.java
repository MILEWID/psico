/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.PersonaNombreEntity;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PersonaNombreRepository;

/**
 *
 * @author USUARIO
 */
@Service
public class PersonaNombreService {
    @Autowired
	PersonaNombreRepository np;
	
	public ArrayList<PersonaNombreEntity> obtener(){
		return (ArrayList<PersonaNombreEntity> ) np.findAll();
	}
	
	public PersonaNombreEntity guardar(PersonaNombreEntity personaname) {
		return np.save(personaname);
	}
        public Optional<PersonaNombreEntity> obtenerPorId(Long id) {
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
