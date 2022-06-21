/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.PersonaNombreEntity;
import com.example.demo.service.PersonaNombreService;
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
@RequestMapping("/personanombre")
public class PersonaNombreController {
    @Autowired
	PersonaNombreService np ;
	
	@GetMapping()
	public ArrayList<PersonaNombreEntity> obtenernp(){
		return np.obtener();
	}
	
	@PostMapping()
		public PersonaNombreEntity guardarnp(@RequestBody PersonaNombreEntity nombre) {
			return this.np.guardar(nombre);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarnp(@PathVariable("id") Long id){
                      boolean ok = this.np.eliminar(id);
            if(ok){
                return "El nombre de la persona se eliminó correctamente ";
            }
            else{
                return "El nombre de la persona no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<PersonaNombreEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.np.obtenerPorId(id);
	}
}
