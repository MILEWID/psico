/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Historia_EnfermedadEntity;
import com.example.demo.repository.Historia_EnfermedadRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Historia_EnfermedadService {
       @Autowired
       Historia_EnfermedadRepository he;
	
	public ArrayList<Historia_EnfermedadEntity> obtener(){
		return (ArrayList<Historia_EnfermedadEntity> ) he.findAll();
	}
	
	public Historia_EnfermedadEntity guardar(Historia_EnfermedadEntity hee) {
		return he.save(hee);
	}
        public Optional<Historia_EnfermedadEntity> obtenerPorId(Long id) {
		return he.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                he.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
