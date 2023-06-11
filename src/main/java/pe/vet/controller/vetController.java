
package pe.vet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.vet.model.vetModel;
import pe.vet.service.IVetService;

@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RequestMapping("veterinaria")
public class vetController {
    
    @Autowired
    private IVetService vetService;
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String getVetId(Model model, @PathVariable("id") Integer veterinariaId){
        vetModel veterinaria = vetService.buscarPorId(veterinariaId);
        model.addAttribute("vet",veterinaria);
        return "infoVeterinaria";
    }
    
    
}
