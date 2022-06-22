/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.PersonaDireccionEntity;
import com.example.demo.repository.PersonaDireccionRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class PersonaDireccionService {
    @Autowired
	PersonaDireccionRepository pd;
	
	public ArrayList<PersonaDireccionEntity> obtener(){
		return (ArrayList<PersonaDireccionEntity> ) pd.findAll();
	}
	
	public PersonaDireccionEntity guardar(PersonaDireccionEntity pde) {
		return pd.save(pde);
	}
        public Optional<PersonaDireccionEntity> obtenerPorId(Long id) {
		return pd.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                pd.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
