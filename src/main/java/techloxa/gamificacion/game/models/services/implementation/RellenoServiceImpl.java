package techloxa.gamificacion.game.models.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techloxa.gamificacion.game.models.dao.IRellenoRepository;
import techloxa.gamificacion.game.models.entities.Relleno;
import techloxa.gamificacion.game.models.services.interfaces.IRellenoService;

@Service
public class RellenoServiceImpl implements IRellenoService{

	@Autowired
	private IRellenoRepository repoRelleno;

	@Override
	public List<Relleno> listAll() {

		return repoRelleno.findAll();
	}

	@Override
	public void save(Relleno profesor) {
		repoRelleno.save(profesor);
		
	}

	@Override
	public Relleno get(Integer id) {
		return repoRelleno.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		repoRelleno.deleteById(id);
		
	}
}
