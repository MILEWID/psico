package com.example.demo.controller;

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

import com.example.demo.service.tratamientoService;
import com.example.demo.models.tratamientoEntity;

@RestController

@RequestMapping("/tratamiento")

public class tratamientoController {
	
	@Autowired
	tratamientoService tratamientoService;
	
	@GetMapping()
	public ArrayList<tratamientoEntity> obtenerTratamiento(){
		return tratamientoService.obtenerTratamiento();
	}
	
	@PostMapping()
	public tratamientoEntity guardarTratamiento(@RequestBody tratamientoEntity tratamiento) {
		return this.tratamientoService.guardarTratamiento(tratamiento);
	}
	
	@GetMapping(path="/{id}")
	public Optional<tratamientoEntity> obtenerTratamientoPorId(@PathVariable("id") Long id){
		return tratamientoService.obtenerTratamientoPorId(id);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id")Long id) {
		boolean ok=this.tratamientoService.eliminarTratamiento(id);
			if (ok) {
				return "Se eliminó el tratamiento con id "+id;
			}else {
				return "No se pudo eliminar el tratamiento con id "+id;
			}
	}

}
