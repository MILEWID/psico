/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.Grupo_FamiliarEntity;
import com.example.demo.repository.Grupo_FamiliarRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Grupo_FamiliarService {
       @Autowired
       Grupo_FamiliarRepository gf;
	
	public ArrayList<Grupo_FamiliarEntity> obtener(){
		return (ArrayList<Grupo_FamiliarEntity> ) gf.findAll();
	}
	
	public Grupo_FamiliarEntity guardar(Grupo_FamiliarEntity gfe) {
		return gf.save(gfe);
	}
    
	public Optional<Grupo_FamiliarEntity> obtenerPorId(Long id) {
		return gf.findById(id);
	}
    
	public boolean eliminar(Long id){
            try{
                gf.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
	
	public boolean verificarGrupo_Familiar(Long id) {
		if (gf.findById(id).isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
