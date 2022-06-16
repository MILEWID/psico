package com.example.demo.controller;

import com.example.demo.models.transtornoEntity;
import com.example.demo.service.transtornoService;
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
@RequestMapping("/transtorno")
public class transtornoController {
    @Autowired
	transtornoService espSer ;
	
	@GetMapping()
	public ArrayList<transtornoEntity> obtenertranstorno(){
		return espSer.obtenerTranstorno();
	}
	
	@PostMapping()
		public transtornoEntity guardarTranstorno(@RequestBody transtornoEntity transtorno) {
			return this.espSer.guardarTranstorno(transtorno);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarTranstorno(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarTranstorno(id);
            if(ok){
                return "el transtorno se elimino correctamente ";
            }
            else{
                return "el transtorno no se elimino correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<transtornoEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
