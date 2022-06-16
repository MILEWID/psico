/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.asistenteEntity;
import com.example.demo.service.asistenteService;
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
@RequestMapping("/asistente")
public class asistenteController {
    @Autowired
    asistenteService asistente ;
	
	@GetMapping()
	public ArrayList<asistenteEntity> obtenerAsistente(){
		return asistente.obtenerAsistente();
	}
	
	@PostMapping()
		public asistenteEntity guardarAsistente(@RequestBody asistenteEntity asistente) {
			return this.asistente.guardarAsistente(asistente);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarAsistente(@PathVariable("id") Long id){
                      boolean ok = this.asistente.eliminarAsistente(id);
            if(ok){
                return "Los datos del asistente fueron eliminados correctamente ";
            }
            else{
                return "Los datos del asistente" + id +" no se eliminaron correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<asistenteEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.asistente.obtenerPorId(id);
	}
}
