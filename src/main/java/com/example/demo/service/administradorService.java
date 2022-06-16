/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.administradorEntity;
import com.example.demo.repository.administradorRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class administradorService {
    @Autowired
    administradorRepository asis;
	
	public ArrayList<administradorEntity> obtenerAdministrador(){
		return (ArrayList<administradorEntity> ) asis.findAll();
	}
	
	public administradorEntity guardarAdministrador(administradorEntity usuario) {
		return asis.save(usuario);
	}
        public Optional<administradorEntity> obtenerPorId(Long id) {
		return asis.findById(id);
	}
        public boolean eliminarAdministrador(Long id){
            try{
            	asis.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
