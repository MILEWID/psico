/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.cieEntity;
import com.example.demo.repository.cieRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class cieService {
       @Autowired
	cieRepository cie;
	
	public ArrayList<cieEntity> obtener(){
		return (ArrayList<cieEntity> ) cie.findAll();
	}
	
	public cieEntity guardar(cieEntity ci) {
		return cie.save(ci);
	}
        public Optional<cieEntity> obtenerPorId(Long id) {
		return cie.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                cie.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
