/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Models.Seguimiento_EdadesEntity;
import Service.Seguimiento_EdadesService;
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
@RequestMapping("/seguimiento_edades")
public class Seguimiento_EdadesController {
    @Autowired
	Seguimiento_EdadesService seg ;
	
	@GetMapping()
	public ArrayList<Seguimiento_EdadesEntity> obtenerSeguimiento_Edades(){
		return seg.obtenerSeguimiento_Edades();
	}
	
	@PostMapping()
		public Seguimiento_EdadesEntity guardarSeguimiento_Edades(@RequestBody Seguimiento_EdadesEntity seguimiento) {
			return this.seg.guardarSeguimiento_Edades(seguimiento);
	}
        @DeleteMapping(path ="/{id}")
                  public String eliminarSeguimiento_Edades(@PathVariable("id") Long id){
                      boolean ok = this.seg.eliminarSeguimiento_Edades(id);
            if(ok){
                return "El seguimiento de la edad del paciente se eliminó correctamente ";
            }
            else{
                return "El seguimiento " + id +" no fue eliminado correctamente ";
            }
        }
        @GetMapping(path ="/{id}")
	 public Optional<Seguimiento_EdadesEntity> obtenerPorId(@PathVariable("id") Long id) {
		return this.seg.obtenerPorId(id);
	}
}
