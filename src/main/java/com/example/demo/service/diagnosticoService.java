/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.diagnosticoEntity;
import com.example.demo.repository.diagnosticoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class diagnosticoService {
      @Autowired
	diagnosticoRepository dia;
	
	public ArrayList<diagnosticoEntity> obtener(){
		return (ArrayList<diagnosticoEntity> ) dia.findAll();
	}
	
	public diagnosticoEntity guardar(diagnosticoEntity diag) {
		return dia.save(diag);
	}
        public Optional<diagnosticoEntity> obtenerPorId(Long id) {
		return dia.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                dia.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
        public Long obtenerCount() {
        return dia.count();
}
      
}
