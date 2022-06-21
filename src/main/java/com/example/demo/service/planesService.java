/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.planesEntity;
import com.example.demo.repository.planesRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class planesService {
     @Autowired
	planesRepository pr;
	
	public ArrayList<planesEntity> obtener(){
		return (ArrayList<planesEntity> ) pr.findAll();
	}
	
	public planesEntity guardar(planesEntity plan) {
		return pr.save(plan);
	}
        public Optional<planesEntity> obtenerPorId(Long id) {
		return pr.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                pr.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
