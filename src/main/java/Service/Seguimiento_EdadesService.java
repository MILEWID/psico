/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Models.Seguimiento_EdadesEntity;
import Repository.Seguimiento_EdadesRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class Seguimiento_EdadesService {
    @Autowired
	Seguimiento_EdadesRepository seg;
	
	public ArrayList<Seguimiento_EdadesEntity> obtenerSeguimiento_Edades(){
		return (ArrayList<Seguimiento_EdadesEntity> ) seg.findAll();
	}
	
	public Seguimiento_EdadesEntity guardarSeguimiento_Edades(Seguimiento_EdadesEntity seguimiento) {
		return seg.save(seguimiento);
	}
        public Optional<Seguimiento_EdadesEntity> obtenerPorId(Long id) {
		return seg.findById(id);
	}
        public boolean eliminarSeguimiento_Edades(Long id){
            try{
                seg.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
