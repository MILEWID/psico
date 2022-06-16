package com.example.demo.controller;
//HOLII
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

import com.example.demo.models.CitaMedicaEntity;
import com.example.demo.service.citaMedicaService;

@RestController
@RequestMapping("/citamedica")
public class citaMedicaController {

	@Autowired
	citaMedicaService citaMedicaService;
	
	@GetMapping()
	public ArrayList<CitaMedicaEntity> obtenerCitaMedica(){
		return citaMedicaService.obtenerCitaMedica();
	}
	
	@PostMapping()
	public CitaMedicaEntity guardarCitaMedica(@RequestBody CitaMedicaEntity citaMedica) {
		return this.citaMedicaService.guardarCitaMedica(citaMedica);
	}
	
	@GetMapping(path= "/{id}")
	public Optional<CitaMedicaEntity> obtenerCitaMedicaPorId(@PathVariable("id") Long id){
		return citaMedicaService.obtenerCitaMedicaPorId(id);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id")Long id) {
		boolean ok=this.citaMedicaService.eliminarCitaMedica(id);
		if (ok) {
			return "Se eliminó el usuario con id "+id;
		}else {
			return "No se pudo eliminar el usuario con id "+id;
		}
	}
}
