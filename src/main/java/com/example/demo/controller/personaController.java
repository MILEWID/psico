/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.personaEntity;
import com.example.demo.service.personaService;
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
@RequestMapping("/persona")
public class personaController {
     @Autowired
	personaService perSer ;
	
	@GetMapping()
	public ArrayList<personaEntity> obtenerpersona(){
		return perSer.obtenerPersona();
	}
	
	@PostMapping()
		public personaEntity guardarpersona(@RequestBody personaEntity per) {
			return this.perSer.guardarPersona(per);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarPersona(@PathVariable("id") Long id){
                      boolean ok = this.perSer.eliminarPersona(id);
            if(ok){
                return "se elimino correctamente ";
            }
            else{
                return "no se elimino correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<personaEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.perSer.obtenerPersonaiId(id);
	}
}
