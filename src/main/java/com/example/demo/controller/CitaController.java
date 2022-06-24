package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.CitaEntity;
import com.example.demo.service.CitaService;

@RestController

@RequestMapping("/cita")

public class CitaController {
	
	@Autowired
	
	CitaService cita;
	
	@GetMapping()
	public ArrayList<CitaEntity> obtenerCita(){
		return cita.obtenerCita();
	}
	
	@PostMapping()
	public CitaEntity guardarCita(@RequestBody CitaEntity cita){
		return this.cita.guardarCita(cita);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarCita(@PathVariable("id")Long id){
		boolean ok=this.cita.eliminarCita(id);
		if(ok) {
			return "La cita se eliminó correctamente";
		}else {
			return "La cita no se eliminó";
		}
	}
	
	@GetMapping(path="/{id}")
	public Optional<CitaEntity> obtenerCitaPorId(@PathVariable("id") Long id){
		return this.cita.obtenerPorId(id);
	}
	
	@GetMapping(path="/verificar/{id}")
	public String verificarCita(@PathVariable("id")Long id){
		boolean ok=this.cita.verificarCita(id);
		if(ok) {
			return "La cita existe";
		}else {
			return "La cita no existe";
		}
	}
}
