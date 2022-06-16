/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.seguimientoEntity;
import com.example.demo.repository.seguimientoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class seguimientoService {
     @Autowired
	seguimientoRepository rep;
	
	public ArrayList<seguimientoEntity> obtenerseguimiento(){
		return (ArrayList<seguimientoEntity> ) rep.findAll();
	}
	
	public seguimientoEntity guardarSeguimiento(seguimientoEntity seg) {
		return rep.save(seg);
	}
        public Optional<seguimientoEntity> obtenerSeguimientoiId(Long id) {
		return rep.findById(id);
	}
        public boolean eliminarSeguimiento(Long id){
            try{
                rep.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
