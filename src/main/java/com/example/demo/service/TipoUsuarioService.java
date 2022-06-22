/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.TipoUsuarioEntity;
import com.example.demo.repository.TipoUsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class TipoUsuarioService {
    @Autowired
	TipoUsuarioRepository tu;
	
	public ArrayList<TipoUsuarioEntity> obtener(){
		return (ArrayList<TipoUsuarioEntity> ) tu.findAll();
	}
	
	public TipoUsuarioEntity guardar(TipoUsuarioEntity tue) {
		return tu.save(tue);
	}
        public Optional<TipoUsuarioEntity> obtenerPorId(Long id) {
		return tu.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                tu.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
