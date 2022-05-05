package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IRecoUsuarioDao;
import pe.edu.upc.entities.RecoUsuario;
import pe.edu.upc.serviceinterfaces.IRecoUsuarioService;

@Named
public class RecoUsuarioServiceImpl implements IRecoUsuarioService {

	@Inject
	private IRecoUsuarioDao ruDao;

	@Override
	public void insert(RecoUsuario ru) {
		// TODO Auto-generated method stub
		ruDao.insert(ru);
	}

	@Override
	public List<RecoUsuario> list() {
		// TODO Auto-generated method stub
		return ruDao.list();
	}

	

}
