/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.administradorEntity;
import com.example.demo.service.administradorService;
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
@RequestMapping("/administrador")
public class administradorController {
    @Autowired
    administradorService administrador ;
	
	@GetMapping()
	public ArrayList<administradorEntity> obtenerAdministrador(){
		return administrador.obtenerAdministrador();
	}
	
	@PostMapping()
		public administradorEntity guardarAdministrador(@RequestBody administradorEntity administrador) {
			return this.administrador.guardarAdministrador(administrador);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarAdministrador(@PathVariable("id") Long id){
                      boolean ok = this.administrador.eliminarAdministrador(id);
            if(ok){
                return "Los datos del administrador fueron eliminados correctamente ";
            }
            else{
                return "Los datos del administrador" + id +" no se eliminaron correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<administradorEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.administrador.obtenerPorId(id);
	}
}
