
package pe.vet.service;

import java.util.List;
import pe.vet.model.vetModel;

public interface IVetService {
    List<vetModel> buscarTodas();
	vetModel buscarPorId(Integer idVeterinaria);
}
