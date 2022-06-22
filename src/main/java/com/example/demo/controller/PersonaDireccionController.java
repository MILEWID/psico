/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.PersonaDireccionEntity;
import com.example.demo.service.PersonaDireccionService;
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
 * @author USUARIO
 */

@RestController
@RequestMapping("/personadireccion")
public class PersonaDireccionController {
    @Autowired
	PersonaDireccionService pd ;
	
	@GetMapping()
	public ArrayList<PersonaDireccionEntity> obtenerpd(){
		return pd.obtener();
	}
	
	@PostMapping()
		public PersonaDireccionEntity guardarpd(@RequestBody PersonaDireccionEntity direccion) {
			return this.pd.guardar(direccion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarpd(@PathVariable("id") Long id){
                      boolean ok = this.pd.eliminar(id);
            if(ok){
                return "La dirección se eliminó correctamente ";
            }
            else{
                return "La dirección no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<PersonaDireccionEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.pd.obtenerPorId(id);
	}
}
