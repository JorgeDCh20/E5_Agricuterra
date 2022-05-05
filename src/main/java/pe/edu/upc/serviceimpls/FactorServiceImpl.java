package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IFactorDao;
import pe.edu.upc.entities.Factor;
import pe.edu.upc.serviceinterfaces.IFactorService;

@Named
public class FactorServiceImpl implements IFactorService {
	@Inject
	private IFactorDao feDao;

	@Override
	public void insert(Factor f) {
		// TODO Auto-generated method stub
		feDao.insert(f);
	}

	@Override
	public List<Factor> list() {
		// TODO Auto-generated method stub
		return feDao.list();
	}

	@Override
	public void update(Factor f) {
		// TODO Auto-generated method stub
		feDao.update(f);

	}

}
