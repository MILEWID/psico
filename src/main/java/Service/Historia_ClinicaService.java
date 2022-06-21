/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Models.Historia_ClinicaEntity;
import Repository.Historia_ClinicaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class Historia_ClinicaService {
    @Autowired
	Historia_ClinicaRepository hist;
	
	public ArrayList<Historia_ClinicaEntity> obtenerHistoriaClinica(){
		return (ArrayList<Historia_ClinicaEntity> ) hist.findAll();
	}
	
	public Historia_ClinicaEntity guardarHistoriaClinica(Historia_ClinicaEntity historia) {
		return hist.save(historia);
	}
        public Optional<Historia_ClinicaEntity> obtenerPorId(Long id) {
		return hist.findById(id);
	}
        public boolean eliminarHistoriaClinica(Long id){
            try{
                hist.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
