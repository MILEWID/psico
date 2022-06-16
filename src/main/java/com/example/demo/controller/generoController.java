package com.example.demo.controller;

import com.example.demo.models.generoEntity;
import com.example.demo.service.generoService;
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
@RequestMapping("/genero")
public class generoController {
    @Autowired
	generoService espSer ;
	
	@GetMapping()
	public ArrayList<generoEntity> obtenergenero(){
		return espSer.obtenerGenero();
	}
	
	@PostMapping()
		public generoEntity guardarGenero(@RequestBody generoEntity genero) {
			return this.espSer.guardarGenero(genero);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarGenero(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarGenero(id);
            if(ok){
                return "el genero se elimino correctamente ";
            }
            else{
                return "el genero no se elimino correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<generoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
