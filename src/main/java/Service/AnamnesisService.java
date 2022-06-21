/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Models.AnamnesisEntity;
import Repository.AnamnesisRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Usuario
 */

@Service
public class AnamnesisService {
    @Autowired
	AnamnesisRepository anam;
	
	public ArrayList<AnamnesisEntity> obtenerAnamesis(){
		return (ArrayList<AnamnesisEntity> ) anam.findAll();
	}
	
	public AnamnesisEntity guardarAnamnesis(AnamnesisEntity usuario) {
		return anam.save(usuario);
	}
        public Optional<AnamnesisEntity> obtenerPorId(Long id) {
		return anam.findById(id);
	}
        public boolean eliminarAnamnesis(Long id){
            try{
                anam.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
