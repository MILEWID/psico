/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.medicoEntity;
import com.example.demo.repository.medicoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class medicoService {
    @Autowired
	medicoRepository med;
	
	public ArrayList<medicoEntity> obtenerMedico(){
		return (ArrayList<medicoEntity> ) med.findAll();
	}
	
	public medicoEntity guardarMedico(medicoEntity usuario) {
		return med.save(usuario);
	}
        public Optional<medicoEntity> obtenerPorId(Long id) {
		return med.findById(id);
	}
        public boolean eliminarMedico(Long id){
            try{
                med.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
