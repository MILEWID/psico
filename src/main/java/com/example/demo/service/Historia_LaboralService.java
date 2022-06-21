/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Historia_LaboralEntity;
import com.example.demo.repository.Historia_LaboralRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Historia_LaboralService {
       @Autowired
       Historia_LaboralRepository hl;
	
	public ArrayList<Historia_LaboralEntity> obtener(){
		return (ArrayList<Historia_LaboralEntity> ) hl.findAll();
	}
	
	public Historia_LaboralEntity guardar(Historia_LaboralEntity hle) {
		return hl.save(hle);
	}
        public Optional<Historia_LaboralEntity> obtenerPorId(Long id) {
		return hl.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                hl.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}