/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.TipoUsuarioEntity;
import com.example.demo.service.TipoUsuarioService;
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

/**
 *
 * @author USUARIO
 */

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
    @Autowired
	TipoUsuarioService tu ;
	
	@GetMapping()
	public ArrayList<TipoUsuarioEntity> obtenertu(){
		return tu.obtener();
	}
	
	@PostMapping()
		public TipoUsuarioEntity guardartu(@RequestBody TipoUsuarioEntity tipo) {
			return this.tu.guardar(tipo);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminartu(@PathVariable("id") Long id){
                      boolean ok = this.tu.eliminar(id);
            if(ok){
                return "El tipo de usuairo se eliminó correctamente ";
            }
            else{
                return "El tipo de usuairo no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<TipoUsuarioEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.tu.obtenerPorId(id);
	}
}
