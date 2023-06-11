package pe.vet.service;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.vet.model.vetModel;

@Service
public class VetServiceImpl implements IVetService {

    List<vetModel> lista = null;

    public VetServiceImpl() {
        lista = new LinkedList<>();
        
        vetModel vet1 = new vetModel();
        vet1.setId(1);
        vet1.setLogo("logo1.jpg");
        vet1.setNombre("Mundo Animal");
        vet1.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
        vet1.setDireccion("Av. Tacna 2300");
        vet1.setHorario("9am-5pm");
        vet1.setDestacado(1);

        vetModel vet2 = new vetModel();
        vet2.setId(2);
        vet2.setLogo("logo2.png");
        vet2.setNombre("Vida Animal");
        vet2.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
        vet2.setDireccion("Av. Paseo de la Republica 1000");
        vet2.setHorario("10am-3pm");
        vet2.setDestacado(0);

        vetModel vet3 = new vetModel();
        vet3.setId(3);
        vet3.setLogo("logo3.png");
        vet3.setNombre("Patita's");
        vet3.setDescripcion("Diagnosticar, pronosticar, tratar y prevenir enfermedades.");
        vet3.setDireccion("Av. Emancipacion 1590");
        vet3.setHorario("7am-7pm");
        vet3.setDestacado(1);

        lista.add(vet1);
        lista.add(vet2);
        lista.add(vet3);
    }

    @Override
    public List<vetModel> buscarTodas() {
        return lista;
    }

    @Override
    public vetModel buscarPorId(Integer idVeterinaria) {
        for (vetModel v : lista) {
            if (v.getId() == idVeterinaria) {
                return v;
            }
        }
        return null;
    }

}
