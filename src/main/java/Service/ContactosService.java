/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Models.ContactosEntity;
import Repository.ContactosRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class ContactosService {
    @Autowired
	ContactosRepository contacto;
	
	public ArrayList<ContactosEntity> obtenerContacto(){
		return (ArrayList<ContactosEntity> ) contacto.findAll();
	}
	
	public ContactosEntity guardarContacto(ContactosEntity usuario) {
		return contacto.save(usuario);
	}
        public Optional<ContactosEntity> obtenerPorId(Long id) {
		return contacto.findById(id);
	}
        public boolean eliminarContacto(Long id){
            try{
                contacto.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
}
