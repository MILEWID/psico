package com.example.demo.service;

import com.example.demo.models.generoEntity;
import com.example.demo.repository.generoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class generoService {
    @Autowired
	generoRepository esp;
	
	public ArrayList<generoEntity> obtenerGenero(){
		return (ArrayList<generoEntity> ) esp.findAll();
	}
	
	public generoEntity guardarGenero(generoEntity genero) {
		return esp.save(genero);
	}
        public Optional<generoEntity> obtenerPorId(Long id) {
		return esp.findById(id);
	}
        public boolean eliminarGenero(Long id){
            try{
                esp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
