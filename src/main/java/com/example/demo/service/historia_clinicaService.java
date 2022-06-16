/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.historia_clinicaEntity;
import com.example.demo.repository.historia_clinicaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class historia_clinicaService {
    @Autowired
	historia_clinicaRepository hist;
	
	public ArrayList<historia_clinicaEntity> obtenerHistoria_Clinica(){
		return (ArrayList<historia_clinicaEntity> ) hist.findAll();
	}
	
	public historia_clinicaEntity guardarHistoria_Clinica(historia_clinicaEntity usuario) {
		return hist.save(usuario);
	}
        public Optional<historia_clinicaEntity> obtenerPorId(Long id) {
		return hist.findById(id);
	}
        public boolean eliminarHistoria_Clinica(Long id){
            try{
                hist.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
