/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Grupo_FamiliarEntity;
import com.example.demo.service.Grupo_FamiliarService;
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
@RequestMapping("/grupofamiliar")
public class Grupo_FamiliarController {
     @Autowired
     Grupo_FamiliarService gf ;
	
	@GetMapping()
	public ArrayList<Grupo_FamiliarEntity> obtenergf(){
		return gf.obtener();
	}
	
	@PostMapping()
		public Grupo_FamiliarEntity guardar(@RequestBody Grupo_FamiliarEntity funcion) {
			return this.gf.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminar(@PathVariable("id") Long id){
                      boolean ok = this.gf.eliminar(id);
            if(ok){
                return "Grupo Familiar se eliminó correctamente ";
            }
            else{
                return "Grupo Familiar " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Grupo_FamiliarEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.gf.obtenerPorId(id);
	}
	 
	 @GetMapping(path="/verificar/{id}")
		public String verificarGrupo_Familiar(@PathVariable("id")Long id){
			boolean ok=this.gf.verificarGrupo_Familiar(id);
			if(ok) {
				return "Grupo Familiar existe";
			}else {
				return "Grupo Familiar no existe";
			}
		}
}