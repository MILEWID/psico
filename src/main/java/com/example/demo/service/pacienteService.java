/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.pacienteEntity;
import com.example.demo.repository.pacienteRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Usuario
 */
@Service
public class pacienteService {
    @Autowired
	pacienteRepository paciente;
	
	public ArrayList<pacienteEntity> obtenerPaciente(){
		return (ArrayList<pacienteEntity> ) paciente.findAll();
	}
	
	public pacienteEntity guardarPaciente(pacienteEntity usuario) {
		return paciente.save(usuario);
	}
        public Optional<pacienteEntity> obtenerPorId(Long id) {
		return paciente.findById(id);
	}
        public boolean eliminarPaciente(Long id){
            try{
                paciente.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
