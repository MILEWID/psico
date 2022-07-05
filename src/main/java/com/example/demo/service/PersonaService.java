/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.PersonaEntity;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.models.Historia_ClinicaEntity;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    @Autowired
	PersonaRepository person;
	
	public ArrayList<PersonaEntity> obtener(){
            return (ArrayList<PersonaEntity> ) person.findAll();
	}
	      
	public String guardar(PersonaEntity per) {
            if (validadorDeCedula(per.getCedula())){
                person.save(per);
                return "datos ingresados";
            }
            else{
                return "no se pudo ingresar los datos";
            }
	}
        public Optional<PersonaEntity> obtenerPorId(Long id) {
		return person.findById(id);
	}
        public boolean eliminar(Long id){
            try{
                person.deleteById(id);
                return true;
            }
            catch(Exception err){
                return false;
            }
        }
        
        public boolean validadorDeCedula(String cedula) {
            boolean cedulaCorrecta = false;
            try {
                if (cedula.length() == 10) {
                    int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                    if (tercerDigito < 6) {
                        // Coeficientes de validación cédula
                        // El decimo digito se lo considera dígito verificador
                        int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                        int verificador = Integer.parseInt(cedula.substring(9,10));
                        int suma = 0;
                        int digito = 0;
                        for (int i = 0; i < (cedula.length() - 1); i++) {
                            digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                            suma += ((digito % 10) + (digito / 10));
                        }

                        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                            cedulaCorrecta = true;
                        }
                        else if ((10 - (suma % 10)) == verificador) {
                            cedulaCorrecta = true;
                        } else {
                            cedulaCorrecta = false;
                        }
                    } else {
                    cedulaCorrecta = false;
                    }
                } else {
                cedulaCorrecta = false;
                }
            } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
            } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
            }

            if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
            }
            return cedulaCorrecta;
        }
}
