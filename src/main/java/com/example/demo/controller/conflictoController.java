/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.conflictoEntity;
import com.example.demo.service.conflictoService;
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
@RequestMapping("/conflicto")
public class conflictoController {
    @Autowired
	conflictoService espSer ;
	
	@GetMapping()
	public ArrayList<conflictoEntity> obtenerusuarios(){
		return espSer.obtenerConflicto();
	}
	
	@PostMapping()
		public conflictoEntity guardarConflicto(@RequestBody conflictoEntity conflicto) {
			return this.espSer.guardarConflicto(conflicto);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarConflicto(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarConflicto(id);
            if(ok){
                return "El conflicto fue eliminado correctamente ";
            }
            else{
                return "El conflicto no se elimino correctamente "+id;
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<conflictoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
