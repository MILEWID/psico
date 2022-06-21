/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Funcion_PsiquicaEntity;
import com.example.demo.service.Funcion_PsiquicaService;
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
@RequestMapping("/funcionpsiquica")
public class Funcion_PsiquicaController {
     @Autowired
	Funcion_PsiquicaService fp ;
	
	@GetMapping()
	public ArrayList<Funcion_PsiquicaEntity> obtenerfp(){
		return fp.obtener();
	}
	
	@PostMapping()
		public Funcion_PsiquicaEntity guardarfp(@RequestBody Funcion_PsiquicaEntity funcion) {
			return this.fp.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarfp(@PathVariable("id") Long id){
                      boolean ok = this.fp.eliminar(id);
            if(ok){
                return "La funcion psiquica se eliminó correctamente ";
            }
            else{
                return "La funcion psiquica " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Funcion_PsiquicaEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.fp.obtenerPorId(id);
	}
}
