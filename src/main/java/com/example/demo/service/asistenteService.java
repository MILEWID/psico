/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.asistenteEntity;
import com.example.demo.repository.asistenteRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class asistenteService {
    @Autowired
	asistenteRepository asis;
	
	public ArrayList<asistenteEntity> obtenerAsistente(){
		return (ArrayList<asistenteEntity> ) asis.findAll();
	}
	
	public asistenteEntity guardarAsistente(asistenteEntity usuario) {
		return asis.save(usuario);
	}
        public Optional<asistenteEntity> obtenerPorId(Long id) {
		return asis.findById(id);
	}
        public boolean eliminarAsistente(Long id){
            try{
            	asis.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}