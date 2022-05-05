package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IRecomXUsuarioDao;
import pe.edu.upc.entities.RecomXUsuario;
import pe.edu.upc.serviceinterfaces.IRecomXUsuarioService;

@Named
public class RecomXUsuarioServiceImpl implements IRecomXUsuarioService {

	@Inject
	private IRecomXUsuarioDao ruDao;

	@Override
	public void insert(RecomXUsuario ru) {
		// TODO Auto-generated method stub
		ruDao.insert(ru);
	}

	@Override
	public List<RecomXUsuario> list() {
		// TODO Auto-generated method stub
		return ruDao.list();
	}

	@Override
	public void update(RecomXUsuario ru) {
		// TODO Auto-generated method stub
		ruDao.update(ru);
	}

}
