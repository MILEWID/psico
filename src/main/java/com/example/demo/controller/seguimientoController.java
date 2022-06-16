/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.seguimientoEntity;
import com.example.demo.service.seguimientoService;
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
@RequestMapping("/seguimiento")
public class seguimientoController {
     @Autowired
	seguimientoService segSer ;
	
	@GetMapping()
	public ArrayList<seguimientoEntity> obtenerseguimiento(){
		return segSer.obtenerseguimiento();
	}
	
	@PostMapping()
		public seguimientoEntity guardarpersona(@RequestBody seguimientoEntity per) {
			return this.segSer.guardarSeguimiento(per);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarseguimiento(@PathVariable("id") Long id){
                      boolean ok = this.segSer.eliminarSeguimiento(id);
            if(ok){
                return "se elimino correctamente ";
            }
            else{
                return "no se elimino correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<seguimientoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.segSer.obtenerSeguimientoiId(id);
	}
}
     
