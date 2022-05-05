package pe.edu.upc.serviceimpls;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;



import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;
@Named
public class UsuarioServiceImpl implements IUsuarioService, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IUsuarioDao uDao;

	@Override
	public void insert(Usuario u) {

		uDao.insert(u);
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return uDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		uDao.delete(id);
	}

	@Override
	public Optional<Usuario> authentication(Usuario u) throws Exception {
		String password = u.getPasswordUsuario();

			u.setPasswordUsuario(password);
			return uDao.findUserByUsername(u);
	
		
	}
}
