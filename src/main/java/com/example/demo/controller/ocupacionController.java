/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.controller;

import com.example.demo.models.ocupacionEntity;
import com.example.demo.service.ocupacionService;
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



@RestController
@RequestMapping("/ocupacion")
public class ocupacionController {
    @Autowired
	ocupacionService ocupSer ;
	
	@GetMapping()
	public ArrayList<ocupacionEntity> obtenerusuarios(){
		return ocupSer.obtenerOcupacion();
	}
	
	@PostMapping()
		public ocupacionEntity guardarOcupacion(@RequestBody ocupacionEntity ocupacion) {
			return this.ocupSer.guardarOcupacion(ocupacion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarOcupacion(@PathVariable("id") Long id){
                      boolean ok = this.ocupSer.eliminarOcupacion(id);
            if(ok){
                return "Se eliminó correctamente ";
            }
            else{
                return "No se eliminó correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<ocupacionEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.ocupSer.obtenerPorId(id);
	}
}
