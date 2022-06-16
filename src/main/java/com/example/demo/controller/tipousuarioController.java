package com.example.demo.controller;

import com.example.demo.models.tipousuarioEntity;
import com.example.demo.service.tipousuarioService;
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
@RequestMapping("/tipo_usuario")
public class tipousuarioController {
    @Autowired
	tipousuarioService espSer ;
	
	@GetMapping()
	public ArrayList<tipousuarioEntity> obtenergenero(){
		return espSer.obtenerTipousuario();
	}
	
	@PostMapping()
		public tipousuarioEntity guardarTipousuario(@RequestBody tipousuarioEntity tipousuario) {
			return this.espSer.guardarTipousuario(tipousuario);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarTipousuario(@PathVariable("id") Long id){
                      boolean ok = this.espSer.eliminarTipousuario(id);
            if(ok){
                return "el tipo de usuario se elimino correctamente ";
            }
            else{
                return "el tipo de usuario no se elimino correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<tipousuarioEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.espSer.obtenerPorId(id);
	}
}
