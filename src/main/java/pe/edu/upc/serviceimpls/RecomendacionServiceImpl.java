package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IRecomendacionDao;
import pe.edu.upc.entities.Recomendacion;
import pe.edu.upc.serviceinterfaces.IRecomendacionService;

@Named
public class RecomendacionServiceImpl implements IRecomendacionService {
	@Inject
	private IRecomendacionDao rDao;

	@Override
	public void insert(Recomendacion r) {
		rDao.insert(r);
	}

	@Override
	public List<Recomendacion> list() {
		// TODO Auto-generated method stub
		return rDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rDao.delete(id);
	}

}
