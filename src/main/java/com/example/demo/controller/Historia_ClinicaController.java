/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;
import com.example.demo.models.Historia_ClinicaEntity;
import com.example.demo.service.Historia_ClinicaService;
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
public class Historia_ClinicaController {
    @Autowired
	Historia_ClinicaService hist ;
	
	@GetMapping()
	public ArrayList<Historia_ClinicaEntity> obtenerContacto(){
		return hist.obtenerHistoriaClinica();
	}
	
	@PostMapping()
		public Historia_ClinicaEntity guardarContacto(@RequestBody Historia_ClinicaEntity historia) {
			return this.hist.guardarHistoriaClinica(historia);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarContacto(@PathVariable("id") Long id){
                      boolean ok = this.hist.eliminarHistoriaClinica(id);
            if(ok){
                return "La historia del paciente se eliminó correctamente ";
            }
            else{
                return "La historia " + id +" no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Historia_ClinicaEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.hist.obtenerPorId(id);
	}
         
        @GetMapping(path="/verificar/{id}")
	public String verificarHistoria(@PathVariable("id")Long id){
		boolean ok=this.hist.verificarHistoria(id);
		if(ok) {
			return "La historia " + id + " existe";
		}else {
			return "La historia " + id + " no existe";
		}
	}
}
