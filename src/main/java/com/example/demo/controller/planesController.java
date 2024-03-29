/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Funcion_PsiquicaEntity;
import com.example.demo.models.planesEntity;
import com.example.demo.service.planesService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/plan")
public class planesController {
     @Autowired
	planesService plan ;
	
	@GetMapping()
	public ArrayList<planesEntity> obtenerplan(){
		return plan.obtener();
	}
	
	@PostMapping()
		public planesEntity guardarplan(@RequestBody planesEntity funcion) {
			return this.plan.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarfp(@PathVariable("id") Long id){
                      boolean ok = this.plan.eliminar(id);
            if(ok){
                return "El plan se eliminó correctamente ";
            }
            else{
                return "La el plan  " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<planesEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.plan.obtenerPorId(id);
	}
    
}
