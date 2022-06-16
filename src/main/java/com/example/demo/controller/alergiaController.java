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

import com.example.demo.models.alergiaEntity;
import com.example.demo.service.alergiaService;

@RestController
@RequestMapping("/alergia")

public class alergiaController {
	
	@Autowired
	alergiaService alergiaService;
	
	@GetMapping()
	public ArrayList<alergiaEntity> obtenerAlergia(){
		return alergiaService.obtenerAlergia();
	}
	
	@PostMapping()
	public alergiaEntity guardarAlergia(@RequestBody alergiaEntity alergia) {
		return this.alergiaService.guardarAlergia(alergia);
	}
	
	@GetMapping(path="/{id}")
	public Optional<alergiaEntity> obtenerAlergiaPorId(@PathVariable("id") Long id){
		return alergiaService.obtenerAlergiaPorId(id);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok=this.alergiaService.eliminarAlergia(id);
		if (ok) {
			return "Se eliminó la alergia con id "+id;
		}else {
			return "No se pudo eliminar la alergia con id "+id;
		}
	}

}
