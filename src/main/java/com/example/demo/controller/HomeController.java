/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.CitaEntity;
import com.example.demo.repository.CitaRepository;
import com.example.demo.service.CitaService;
import com.example.demo.service.Historia_SocialService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Usuario
 */

@Controller
public class HomeController {
    	@Autowired
    CitaService hs ;
    
    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("titulo", "si ves esto puedes ser feliz");
        return "landing";
    }
    @GetMapping("/login")
    public String gologin(Model model){
        return "iniciar-sesion";
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
        return "cliente";
    } 
 
        @GetMapping("/historiaPaciente")
	public String goHistoriaPaciente(Model model){
        return "vistaHistoriaPaciente";
    } 
}
