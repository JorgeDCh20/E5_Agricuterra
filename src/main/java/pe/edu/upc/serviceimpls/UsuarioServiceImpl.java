package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;
@Named
public class UsuarioServiceImpl implements IUsuarioService{
	@Inject
	private IUsuarioDao pDao;

	@Override
	public void insert(Usuario u) {

		pDao.insert(u);
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pDao.delete(id);
	}

	@Override
	public List<Usuario> findByNameUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return pDao.findByNameUsuario(u);
	}
}
