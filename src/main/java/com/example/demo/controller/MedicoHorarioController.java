package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.MedicoHorarioEntity;
import com.example.demo.service.MedicoHorarioService;

@RestController

@RequestMapping("/medicohorario")

public class MedicoHorarioController {
	
	@Autowired
	MedicoHorarioService medicohorario;
	
	@GetMapping()
	public ArrayList<MedicoHorarioEntity> obtenerMedicoHorario(){
		return medicohorario.obtenerMedicoHorario();
	}
	
	@PostMapping()
	public MedicoHorarioEntity guardarMedicoHorario(@RequestBody MedicoHorarioEntity medicohorario) {
		return this.medicohorario.guardarMedicoHorario(medicohorario);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarMedicoHorario(@PathVariable("id")Long id) {
		boolean ok=this.medicohorario.eliminarMedicoHorario(id);
		if(ok) {
			return "El horario del médico se eliminó correctamente";
		}else {
			return "El horario del médico no se eliminó";
		}
	}

}
