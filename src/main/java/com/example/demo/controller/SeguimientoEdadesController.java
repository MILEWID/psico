/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.SeguimientoEdadesEntity;
import com.example.demo.service.SeguimientoEdadesService;
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
@RequestMapping("/seguimientoedades")
public class SeguimientoEdadesController {
    @Autowired
	SeguimientoEdadesService seg ;
	
	@GetMapping()
	public ArrayList<SeguimientoEdadesEntity> obtenerfp(){
		return seg.obtenerSeguimientoEdades();
	}
	
	@PostMapping()
		public SeguimientoEdadesEntity guardarfp(@RequestBody SeguimientoEdadesEntity seguimiento) {
			return this.seg.guardarSeguimientoEdades(seguimiento);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarfp(@PathVariable("id") Long id){
                      boolean ok = this.seg.eliminarSeguimientoEdades(id);
            if(ok){
                return "El seguimiento se eliminó correctamente ";
            }
            else{
                return "El seguimiento " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<SeguimientoEdadesEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.seg.obtenerPorId(id);
	}
}
