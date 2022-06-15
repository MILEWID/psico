/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.especialidadEntity;
import com.example.demo.repository.especialidadRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class especialidadService {
    @Autowired
	especialidadRepository esp;
	
	public ArrayList<especialidadEntity> obtenerEspecialidad(){
		return (ArrayList<especialidadEntity> ) esp.findAll();
	}
	
	public especialidadEntity guardarEspecialidad(especialidadEntity usuario) {
		return esp.save(usuario);
	}
        public Optional<especialidadEntity> obtenerPorId(Long id) {
		return esp.findById(id);
	}
        public boolean eliminarEspecialidad(Long id){
            try{
                esp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
