/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.conflictoEntity;
import com.example.demo.repository.conflictoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Usuario
 */

@Service
public class conflictoService {
    @Autowired
	conflictoRepository conflicto;
	
	public ArrayList<conflictoEntity> obtenerConflicto(){
		return (ArrayList<conflictoEntity> ) conflicto.findAll();
	}
	
	public conflictoEntity guardarConflicto(conflictoEntity usuario) {
		return conflicto.save(usuario);
	}
        public Optional<conflictoEntity> obtenerPorId(Long id) {
		return conflicto.findById(id);
	}
        public boolean eliminarConflicto(Long id){
            try{
                conflicto.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
