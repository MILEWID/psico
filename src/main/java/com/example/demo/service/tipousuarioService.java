package com.example.demo.service;

import com.example.demo.models.tipousuarioEntity;
import com.example.demo.repository.tipousuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tipousuarioService {
    @Autowired
	tipousuarioRepository esp;
	
	public ArrayList<tipousuarioEntity> obtenerTipousuario(){
		return (ArrayList<tipousuarioEntity> ) esp.findAll();
	}
	
	public tipousuarioEntity guardarTipousuario(tipousuarioEntity tipousuario) {
		return esp.save(tipousuario);
	}
        public Optional<tipousuarioEntity> obtenerPorId(Long id) {
		return esp.findById(id);
	}
        public boolean eliminarTipousuario(Long id){
            try{
                esp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
