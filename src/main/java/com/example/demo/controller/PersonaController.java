/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.PersonaEntity;
import com.example.demo.service.PersonaService;
import com.example.demo.models.Historia_ClinicaEntity;
import com.example.demo.service.Historia_ClinicaService;
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
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
	PersonaService person ;
	
	@GetMapping()
	public ArrayList<PersonaEntity> obtenerperson(){
		return person.obtener();
	}
	
        @PostMapping()
        public String  guardarPersona(@RequestBody PersonaEntity funcion) {
            Boolean b = false;
            for (int i=0;i<person.obtener().size() ;i++) {
                if (person.obtener().get(i).getCedula().equals(funcion.getCedula())){
                    b = true;
                }
            }
          if (b == true){
              return "no se puede guardar cedulas repetidas ";
          }else {
            boolean ok = this.person.guardar(funcion);
            if(ok){
                return "se ha guardado correctamente";
            }
            else{
                return "No se pudo ingresar los datos, verifique el numero de cedula";
            }
          }
        }

        @DeleteMapping(path ="/{id}")
        public String eliminarperson(@PathVariable("id") Long id){
            boolean ok = this.person.eliminar(id);
            if(ok){
                return "Los datos de la persona se eliminó correctamente ";
            }
            else{
                return "Los datos de la persona no fue eliminada correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<PersonaEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.person.obtenerPorId(id);
	}
}
