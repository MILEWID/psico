/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.diagnosticoEntity;
import com.example.demo.service.diagnosticoService;
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
@RequestMapping("/diagnostico")
public class diagnosticoController {
     @Autowired
	diagnosticoService dia ;
	
	@GetMapping()
	public ArrayList<diagnosticoEntity> obtenerDia(){
		return dia.obtener();
	}
	
	@PostMapping()
		public diagnosticoEntity guardarDia(@RequestBody diagnosticoEntity funcion) {
			return this.dia.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarDia(@PathVariable("id") Long id){
                      boolean ok = this.dia.eliminar(id);
            if(ok){
                return "El diagnóstico se eliminó correctamente ";
            }
            else{
                return "El diagnóstico " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<diagnosticoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.dia.obtenerPorId(id);
	}
}
