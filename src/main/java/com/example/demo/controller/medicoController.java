/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.medicoEntity;
import com.example.demo.service.medicoService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.ResponseEntity.ok;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/medico")
public class medicoController {
    @Autowired
	medicoService med ;
	
	@GetMapping()
	public ArrayList<medicoEntity> obtenerMedico(){
		return med.obtenerMedico();
	}
	
	@PostMapping()
		public medicoEntity guardarMedico(@RequestBody medicoEntity medico) {
			return this.med.guardarMedico(medico);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarMedico(@PathVariable("id") Long id){
                      boolean ok = this.med.eliminarMedico(id);
            if(ok){
                return "Los datos del médico se eliminaron correctamente ";
            }
            else{
                return "Los datos del médico " + id +" no se eliminaron correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<medicoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.med.obtenerPorId(id);
	}
}
