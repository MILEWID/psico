package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.OcupacionesEntity;
import com.example.demo.service.OcupacionesService;

@RestController

@RequestMapping("/ocupacion")

public class OcupacionesController {
	
	@Autowired
	OcupacionesService ocupacion;
	
	@GetMapping()
	public ArrayList<OcupacionesEntity> obtenerOcupaciones(){
		return ocupacion.obtenerOcupaciones();
	}
	
	@PostMapping()
	public OcupacionesEntity guardarOcupaciones(@RequestBody OcupacionesEntity ocupacion) {
		return this.ocupacion.guardarOcupaciones(ocupacion);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarOcupaciones(@PathVariable("id")Long id) {
		boolean ok=this.ocupacion.eliminarOcupaciones(id);
		if(ok) {
			return "La ocupación se eliminó correctamente";
		}else {
			return "La ocupación no se eliminó";
		}
	}

	@GetMapping(path="/{id}")
	public Optional<OcupacionesEntity> obtenerPorId(@PathVariable("id") Long id){
		return this.ocupacion.obtenerPorId(id);
	}
	
	@GetMapping(path="/verificar/{id}")
	public String verificarOcupaciones(@PathVariable("id")Long id) {
		boolean ok=this.ocupacion.verificarOcupaciones(id);
		if(ok) {
			return "La ocupación existe";
		}else {
			return "La ocupación no existe";
		}
	}
}
