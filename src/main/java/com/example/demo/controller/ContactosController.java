/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.ContactosEntity;
import com.example.demo.service.ContactosService;
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

/**
 *
 * @author Usuario
 */

@RestController
@RequestMapping("/contactos")
public class ContactosController {
     @Autowired
	ContactosService contacto ;
	
	@GetMapping()
	public ArrayList<ContactosEntity> obtenerContacto(){
		return contacto.obtenerContacto();
	}
	
	@PostMapping()
		public ContactosEntity guardarContacto(@RequestBody ContactosEntity cont) {
			return this.contacto.guardarContacto(cont);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarContacto(@PathVariable("id") Long id){
                      boolean ok = this.contacto.eliminarContacto(id);
            if(ok){
                return "El contacto del paciente se eliminó correctamente ";
            }
            else{
                return "El contacto " + id +" no fue eliminado correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<ContactosEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.contacto.obtenerPorId(id);
	}
}
