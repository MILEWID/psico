/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.controller;

import com.example.demo.models.especialidadEntity;
import com.example.demo.service.especialidadService;
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
@RequestMapping("/especialidad")
public class especialidadController {
    @Autowired
	especialidadService espSer ;
	
	@GetMapping()
	public ArrayList<especialidadEntity> obtenerusuarios(){
		return espSer.obtenerEspecialidad();
	}
	
	@PostMapping()
		public especialidadEntity guardarEspecialidad(@RequestBody especialidadEntity especialidad) {
			return this.espSer.guardarEspecialidad(especialidad);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarEspecialidad(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarEspecialidad(id);
            if(ok){
                return "se elimino correctamente ";
            }
            else{
                return "no se elimino correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<especialidadEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
