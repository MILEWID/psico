/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.SeguimientoEdadesEntity;
import com.example.demo.repository.SeguimientoEdadesRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class SeguimientoEdadesService {
    @Autowired
	SeguimientoEdadesRepository seg;
	
	public ArrayList<SeguimientoEdadesEntity> obtenerSeguimientoEdades(){
		return (ArrayList<SeguimientoEdadesEntity> ) seg.findAll();
	}
	
	public SeguimientoEdadesEntity guardarSeguimientoEdades(SeguimientoEdadesEntity seguimiento) {
		return seg.save(seguimiento);
	}
        public Optional<SeguimientoEdadesEntity> obtenerPorId(Long id) {
		return seg.findById(id);
	}
        public boolean eliminarSeguimientoEdades(Long id){
            try{
                seg.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
