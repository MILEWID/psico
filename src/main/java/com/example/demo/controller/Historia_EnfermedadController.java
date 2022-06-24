/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Historia_EnfermedadEntity;
import com.example.demo.service.Historia_EnfermedadService;
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
@RequestMapping("/historiaenfermedad")
public class Historia_EnfermedadController {
     @Autowired
     Historia_EnfermedadService he ;
	
	@GetMapping()
	public ArrayList<Historia_EnfermedadEntity> obtenerhe(){
		return he.obtener();
	}
	
	@PostMapping()
		public Historia_EnfermedadEntity guardar(@RequestBody Historia_EnfermedadEntity funcion) {
			return this.he.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminar(@PathVariable("id") Long id){
                      boolean ok = this.he.eliminar(id);
            if(ok){
                return "Historia Enfermedad se eliminó correctamente ";
            }
            else{
                return "Historia Enfermedad " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Historia_EnfermedadEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.he.obtenerPorId(id);
	}
	 
	 @GetMapping(path="/verificar/{id}")
		public String verificarHistoria_Enfermedad(@PathVariable("id")Long id){
			boolean ok=this.he.verificarHistoria_Enfermedad(id);
			if(ok) {
				return "Historia Enfermedad existe";
			}else {
				return "Historia Enfermedad no existe";
			}
		}
}
