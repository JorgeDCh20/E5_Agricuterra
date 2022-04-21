package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipoFactorDao;
import pe.edu.upc.entities.TipoFactor;
import pe.edu.upc.serviceinterfaces.ITipoFactorService;

@Named
public class TipoFactorServiceImpl implements ITipoFactorService {
	@Inject
	private ITipoFactorDao tfDao;

	@Override
	public void insert(TipoFactor tf) {

		tfDao.insert(tf);
	}

	@Override
	public List<TipoFactor> list() {
		// TODO Auto-generated method stub
		return tfDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tfDao.delete(id);
	}
	
}

