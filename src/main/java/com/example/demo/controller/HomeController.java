/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.CitaEntity;
import com.example.demo.service.CitaService;
import com.example.demo.service.Historia_SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/deletecita")
	public String deleteEmployee(@RequestParam Long idcita) {
		hs.eliminarCita(idcita);
		return "redirect:/citas";
	}
 
    
}
