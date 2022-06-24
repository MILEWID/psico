/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.Historia_LaboralEntity;
import com.example.demo.service.Historia_LaboralService;
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
@RequestMapping("/historialaboral")
public class Historia_LaboralController {
     @Autowired
     Historia_LaboralService hl ;
	
	@GetMapping()
	public ArrayList<Historia_LaboralEntity> obtenerhl(){
		return hl.obtener();
	}
	
	@PostMapping()
		public Historia_LaboralEntity guardar(@RequestBody Historia_LaboralEntity funcion) {
			return this.hl.guardar(funcion);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminar(@PathVariable("id") Long id){
                      boolean ok = this.hl.eliminar(id);
            if(ok){
                return "Historia Laboral se eliminó correctamente ";
            }
            else{
                return "Historia Laboral " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Historia_LaboralEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.hl.obtenerPorId(id);
	}
	 
	 @GetMapping(path="/verificar/{id}")
		public String verificarHistoria_Laboral(@PathVariable("id")Long id){
			boolean ok=this.hl.verificarHistoria_Laboral(id);
			if(ok) {
				return "Historia Laboral existe";
			}else {
				return "Historia Laboral no existe";
			}
		}
}
