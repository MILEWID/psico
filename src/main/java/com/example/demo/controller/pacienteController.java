/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.pacienteEntity;
import com.example.demo.service.pacienteService;
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

@RestController
@RequestMapping("/paciente")
public class pacienteController {
    @Autowired
	pacienteService paciente ;
	
	@GetMapping()
	public ArrayList<pacienteEntity> obtenerPaciente(){
		return paciente.obtenerPaciente();
	}
	
	@PostMapping()
		public pacienteEntity guardarPaciente(@RequestBody pacienteEntity paciente) {
			return this.paciente.guardarPaciente(paciente);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarPaciente(@PathVariable("id") Long id){
                      boolean ok = this.paciente.eliminarPaciente(id);
            if(ok){
                return "Los datos del paciente fueron eliminados correctamente ";
            }
            else{
                return "Los datos del paciente" + id +" no se eliminaron correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<pacienteEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.paciente.obtenerPorId(id);
	}
}
