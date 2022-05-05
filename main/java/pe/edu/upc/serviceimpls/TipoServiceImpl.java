package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipoDao;
import pe.edu.upc.entities.Tipo;

import pe.edu.upc.serviceinterfaces.ITipoService;
@Named
public class TipoServiceImpl implements ITipoService{
	@Inject
	private ITipoDao tDao;

	@Override
	public void insert(Tipo t) {

		tDao.insert(t);
	}

	@Override
	public List<Tipo> list() {
		// TODO Auto-generated method stub
		return tDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tDao.delete(id);
	}
}
