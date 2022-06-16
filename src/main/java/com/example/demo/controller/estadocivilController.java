/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.especialidadEntity;
import com.example.demo.models.estadocivilEntity;
import com.example.demo.service.especialidadService;
import com.example.demo.service.estadocivilService;
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
@RequestMapping("/estadocivil")
public class estadocivilController {
    @Autowired
	estadocivilService ecSer ;
	
	@GetMapping()
	public ArrayList<estadocivilEntity> obtenerestadocivil(){
		return ecSer.obtenerEstadoCivil();
	}
	
	@PostMapping()
		public estadocivilEntity guardarEstadoCivil(@RequestBody estadocivilEntity estadocivil) {
			return this.ecSer.guardarEstadocivil(estadocivil);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarEstadocivil(@PathVariable("id") Long id){
                      boolean ok = this.ecSer.eliminarEstadoCivil(id);
            if(ok){
                return "se elimino correctamente ";
            }
            else{
                return "no se elimino correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<estadocivilEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.ecSer.obtenerEstadoCivilporid(id);
	}
}
