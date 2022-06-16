/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.ocupacionEntity;
import com.example.demo.repository.ocupacionRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ocupacionService {
	 @Autowired
		ocupacionRepository ocupacion;

	 public ArrayList<ocupacionEntity> obtenerOcupacion(){
			return (ArrayList<ocupacionEntity> ) ocupacion.findAll();
		}
		
		public ocupacionEntity guardarOcupacion(ocupacionEntity usuario) {
			return ocupacion.save(usuario);
		}
	        public Optional<ocupacionEntity> obtenerPorId(Long id) {
			return ocupacion.findById(id);
		}
	        public boolean eliminarOcupacion(Long id){
	            try{
	            	ocupacion.deleteById(id);
	                return true;
	            }
	            catch(Exception err){
	                return false;
	            }
	        }
	}
