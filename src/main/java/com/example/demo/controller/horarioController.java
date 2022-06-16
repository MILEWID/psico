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

import com.example.demo.models.horarioEntity;
import com.example.demo.service.horarioService;

@RestController
@RequestMapping("/horario")

public class horarioController {
	
	@Autowired
	horarioService horarioService;
	
	@GetMapping()public ArrayList<horarioEntity> obtenerHorario(){
		return horarioService.obtenerHorario();
	}
	
	@PostMapping()
	public horarioEntity guardarHorario(@RequestBody horarioEntity horario) {
		return this.horarioService.guardarHorario(horario);
	}
	
	@GetMapping(path="/{id}")
	public Optional<horarioEntity> obtenerHorarioPorId(@PathVariable("id") Long id){
		return horarioService.obtenerHorarioPorId(id);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok=this.horarioService.eliminarHorario(id);
		if (ok) {
			return "Se eliminó el horario con id "+id;
		}else {
			return "No se pudo eliminar el horario con id "+id;
		}
	}

}
