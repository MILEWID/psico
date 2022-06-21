/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.cieEntity;
import com.example.demo.service.cieService;
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
@RequestMapping("/cie")
public class cieController {
      @Autowired
	cieService cie ;
	
	@GetMapping()
	public ArrayList<cieEntity> obtenerCie(){
		return cie.obtener();
	}
	
	@PostMapping()
		public cieEntity guardarCie(@RequestBody cieEntity funcion) {
			return this.cie.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarCie(@PathVariable("id") Long id){
                      boolean ok = this.cie.eliminar(id);
            if(ok){
                return "El Cie10 se eliminó correctamente ";
            }
            else{
                return "El Cie10 " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<cieEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.cie.obtenerPorId(id);
	}
}
