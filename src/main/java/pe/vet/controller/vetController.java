
package pe.vet.controller;

import java.util.LinkedList;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.vet.model.vetModel;

@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class vetController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mostrarVet(Model model){
        List<vetModel> list = getVets(); 
        model.addAttribute("vets",list);
        return "home";
    }
    
    private List<vetModel> getVets(){
        List<vetModel> lista = new LinkedList<>();
        
        try {
            vetModel vet1 = new vetModel();
            vet1.setId(1);
            vet1.setLogo("images/logo1.jpg");
            vet1.setNombre("Mundo Animal");
            vet1.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
            vet1.setDireccion("Av. Tacna 2300");
            vet1.setHorario("8am-5pm");
            vet1.setDestacado(1);
            
            vetModel vet2 = new vetModel();
            vet2.setId(2);
            vet2.setLogo("images/logo2.png");
            vet2.setNombre("Vida Animal");
            vet2.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
            vet2.setDireccion("Av. Paseo de la Republica 1000");
            vet2.setHorario("10am-3pm");
            vet2.setDestacado(0);
            
            vetModel vet3 = new vetModel();
            vet3.setId(3);
            vet3.setLogo("images/logo3.png");
            vet3.setNombre("Patita's");
            vet3.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
            vet3.setDireccion("Av. Emancipacion 1590");
            vet3.setHorario("7am-7pm");
            vet3.setDestacado(1);
            
            lista.add(vet1);
            lista.add(vet2);
            lista.add(vet3);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return lista;
    }
    
}
