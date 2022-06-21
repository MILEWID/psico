/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Models.AnamnesisEntity;
import Service.AnamnesisService;
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
@RequestMapping("/anamnesis")
public class AnamnesisController {
    @Autowired
	AnamnesisService anam ;
	
	@GetMapping()
	public ArrayList<AnamnesisEntity> obtenerAnamnesis(){
		return anam.obtenerAnamesis();
	}
	
	@PostMapping()
		public AnamnesisEntity guardarAnamnesis(@RequestBody AnamnesisEntity paciente) {
			return this.anam.guardarAnamnesis(paciente);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarAnamnesis(@PathVariable("id") Long id){
                      boolean ok = this.anam.eliminarAnamnesis(id);
            if(ok){
                return "La anamnesis del paciente se eliminó correctamente ";
            }
            else{
                return "La anamnesis " + id +" no fue eliminado correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<AnamnesisEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.anam.obtenerPorId(id);
	}
}
