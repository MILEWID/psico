/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Historia_SocialEntity;
import com.example.demo.service.Historia_SocialService;
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
@RequestMapping("/historiasocial")
public class Historia_SocialController {
     @Autowired
     Historia_SocialService hs ;
	
	@GetMapping()
	public ArrayList<Historia_SocialEntity> obtenerhs(){
		return hs.obtener();
	}
	
	@PostMapping()
		public Historia_SocialEntity guardar(@RequestBody Historia_SocialEntity funcion) {
			return this.hs.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminar(@PathVariable("id") Long id){
                      boolean ok = this.hs.eliminar(id);
            if(ok){
                return "La Historia Social se eliminó correctamente ";
            }
            else{
                return "La Historia Social " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Historia_SocialEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.hs.obtenerPorId(id);
	}
	 
	 @GetMapping(path="/verificar/{id}")
		public String verificarHistoria_Social(@PathVariable("id")Long id){
			boolean ok=this.hs.verificarHistoria_Social(id);
			if(ok) {
				return "Historia Social existe";
			}else {
				return "Historia Social no existe";
			}
		} 
}