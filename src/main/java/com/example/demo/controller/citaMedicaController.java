package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
