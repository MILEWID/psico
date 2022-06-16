package com.example.demo.service;

import com.example.demo.models.transtornoEntity;
import com.example.demo.repository.transtornoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transtornoService {
    @Autowired
	transtornoRepository esp;
	
	public ArrayList<transtornoEntity> obtenerTranstorno(){
		return (ArrayList<transtornoEntity> ) esp.findAll();
	}
	
	public transtornoEntity guardarTranstorno(transtornoEntity transtorno) {
		return esp.save(transtorno);
	}
        public Optional<transtornoEntity> obtenerPorId(Long id) {
		return esp.findById(id);
	}
        public boolean eliminarTranstorno(Long id){
            try{
                esp.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
