package techloxa.gamificacion.game.models.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techloxa.gamificacion.game.models.dao.IEnlazadoRepository;
import techloxa.gamificacion.game.models.entities.Enlazado;
import techloxa.gamificacion.game.models.services.interfaces.IEnlazadoService;

@Service
public class EnlazadoServiceImpl implements IEnlazadoService{

	@Autowired
	private IEnlazadoRepository repoEnlazado;

	@Override
	public List<Enlazado> listAll() {

		return repoEnlazado.findAll();
	}

	@Override
	public void save(Enlazado profesor) {
		repoEnlazado.save(profesor);
		
	}

	@Override
	public Enlazado get(Integer id) {
		return repoEnlazado.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		repoEnlazado.deleteById(id);
		
	}
}
