/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Historia_SocialEntity;
import com.example.demo.repository.Historia_SocialRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Historia_SocialService {
       @Autowired
       Historia_SocialRepository hs;
	
	public ArrayList<Historia_SocialEntity> obtener(){
		return (ArrayList<Historia_SocialEntity> ) hs.findAll();
	}
	
	public Historia_SocialEntity guardar(Historia_SocialEntity hse) {
		return hs.save(hse);
	}
    
	
	public Optional<Historia_SocialEntity> obtenerPorId(Long id) {
		return hs.findById(id);
	}
    
	public boolean eliminar(Long id){
            try{
                hs.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
	
	public boolean verificarHistoria_Social(Long id) {
		if (hs.findById(id).isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}