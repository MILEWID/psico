/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.CitaEntity;
import com.example.demo.repository.CitaRepository;
import com.example.demo.service.CitaService;
import com.example.demo.service.Historia_ClinicaService;
import com.example.demo.service.Historia_SocialService;
import com.example.demo.service.PersonaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.models.PersonaEntity;
import com.example.demo.service.PersonaService;
import com.example.demo.models.Historia_ClinicaEntity;
import com.example.demo.service.Historia_ClinicaService;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import static org.springframework.jdbc.core.JdbcOperationsExtensionsKt.query;
import javax.persistence.EntityManager;

/**
 *
 * @author Usuario
 */

@Controller
public class HomeController {
    @Autowired
    CitaService hs ;
    
    @Autowired
    Historia_ClinicaService h;
    
    @Autowired
    PersonaService per;
    
    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("titulo", "si ves esto puedes ser feliz");
        return "landing";
    }
    @GetMapping("/login")
    public String gologin(Model model){
        return "iniciar-sesion";
    }
    
    @Autowired
    private Historia_ClinicaService listaHistoria;
    
    @GetMapping("/vista")
    public String goHistoria(Model model){
        //List<Historia_ClinicaEntity> listahistoria = listaHistoria.obtenerHistoriaClinica();
        //model.addAttribute("lista", listaHistoria);
        model.addAttribute("h", h.obtenerHistoriaClinica());
        return "vistaHistoriasMedico";
    }
    
    //citas 
    @GetMapping("/citas")
    public String gocitas(Model model){
            model.addAttribute("citas", hs.obtenerCita());
        return "citas-medicas";
    } 

     @GetMapping("/adminMenu")
     public String goAdminMenu(Model model){
         return "administradorMenu";
     }
     
     @GetMapping("/signup")
     public String gosignup(Model model){
         return "sign-up";
     }

    @GetMapping("/deletecita")
	public String deletecita(@RequestParam Long idcita) {
		hs.eliminarCita(idcita);
		return "redirect:/citas";
	}
        
    @GetMapping("/addcita")
    public String addcita(Model model) {
        CitaEntity cita = new  CitaEntity();
        model.addAttribute("citaa",cita);
        return "new-citas-medicas";
    }
    
     @PostMapping("/addcita")
     public String guardar(@ModelAttribute("citaa") CitaEntity cita) {
         hs.guardarCita(cita);
         return "redirect:/citas";
     }
        
    @GetMapping("/cliente")
	public String goCliente(Model model){
           //model.addAttribute("persona", person.obtenerPorId(Long.parseLong("1")));
        return "cliente";
    } 
 
        @GetMapping("/historiaPaciente")
	public String goHistoriaPaciente(Model model){
        return "vistaHistoriaPaciente";
    } 
    
    @GetMapping("/pacientes")
    public String goPacientes(Model model){
        model.addAttribute("per", per.obtener());
        return "pac";
    }
    
    @GetMapping("/doctor")
	public String goDoctor(Model model){
        return "vistaDoctorInicial";
    } 
        
    @GetMapping("/deletePaciente")
	public String deletePaciente(@RequestParam Long id) {
            per.eliminar(id);
            return "redirect:/pacientes";
	}
    
    @GetMapping("/deleteHistoria")
    public String deleteHistoria(@RequestParam Long id) {
        h.eliminarHistoriaClinica(id);
        return "redirect:/vista";
    }
    
    @GetMapping("/addPaciente")
    public String addPaciente(Model model) {
        PersonaEntity per = new  PersonaEntity();
        model.addAttribute("perso",per);
        return "ingresoPaciente";
    }
    
    @PostMapping("/addPacientee")
     public String guardarPaciente(@ModelAttribute("pacientee") PersonaEntity persona) {
         per.guardar(persona);
         return "redirect:/pacientes";
     }
}
