/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Funcion_PsiquicaEntity;
import com.example.demo.repository.Funcion_PsiquicaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Funcion_PsiquicaService {
       @Autowired
	Funcion_PsiquicaRepository fp;
	
	public ArrayList<Funcion_PsiquicaEntity> obtener(){
		return (ArrayList<Funcion_PsiquicaEntity> ) fp.findAll();
	}
	
	public Funcion_PsiquicaEntity guardar(Funcion_PsiquicaEntity fpe) {
		return fp.save(fpe);
	}
        public Optional<Funcion_PsiquicaEntity> obtenerPorId(Long id) {
		return fp.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                fp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
