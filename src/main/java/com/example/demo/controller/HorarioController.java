package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.HorarioEntity;
import com.example.demo.service.HorarioService;

@RestController

@RequestMapping("/horario")

public class HorarioController {
	
	@Autowired
	
	HorarioService horario;
	
	@GetMapping()
	public ArrayList<HorarioEntity> obtenerHorario(){
		return horario.obtenerHorario();
	}
	
	@PostMapping()
	public HorarioEntity guardarHorario(@RequestBody HorarioEntity horario){
		return this.horario.guardarHorario(horario);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarHorario(@PathVariable("id")Long id){
		boolean ok=this.horario.eliminarHorario(id);
		if(ok) {
			return "El horario se eliminó correctamente";
		}else {
			return "El horario no se eliminó";
		}
	}

}
