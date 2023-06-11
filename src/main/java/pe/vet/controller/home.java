/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.vet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.vet.model.vetModel;
import pe.vet.service.IVetService;

@Controller
public class home {
    
    @Autowired
    private IVetService vetService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mostrarVet(Model model){
        List<vetModel> list = vetService.buscarTodas(); 
        model.addAttribute("vets",list);
        return "home";
    }
    
    @RequestMapping(value = "/crearVeterinaria", method = RequestMethod.GET)
    public String crearVet(Model model){
        List<vetModel> list = vetService.buscarTodas(); 
        model.addAttribute("vets",list);
        return "crearVeterinaria";
    }
}
