/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("titulo", "si ves esto puedes ser feliz");
        return "inicio";
    }
    @GetMapping("/login")
    public String gologin(Model model){
        return "iniciar-sesion";
    }

    
     @GetMapping("/citas")
    public String gocitas(Model model){
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
}
