package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICategoriaDao;
import pe.edu.upc.entities.Categoria;
import pe.edu.upc.serviceinterfaces.ICategoriaService;
@Named
public class CategoriaServiceImpl implements ICategoriaService{
	@Inject
	private ICategoriaDao pDao;

	@Override
	public void insert(Categoria c) {

		pDao.insert(c);
	}

	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pDao.delete(id);
	}
}
