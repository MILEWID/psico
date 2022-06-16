/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.historia_clinicaEntity;
import com.example.demo.service.historia_clinicaService;
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
@RequestMapping("/historia_clinica")
public class historia_clinicaController {
    @Autowired
	historia_clinicaService espSer ;
	
	@GetMapping()
	public ArrayList<historia_clinicaEntity> obtenerHistoria(){
		return espSer.obtenerHistoria_Clinica();
	}
	
	@PostMapping()
		public historia_clinicaEntity guardarHistoria(@RequestBody historia_clinicaEntity historia) {
			return this.espSer.guardarHistoria_Clinica(historia);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarHistoria(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarHistoria_Clinica(id);
            if(ok){
                return "La historia se elimino correctamente ";
            }
            else{
                return "La historia " + id + "no se pudo eliminar correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<historia_clinicaEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
