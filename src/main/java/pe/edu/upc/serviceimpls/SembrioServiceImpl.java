package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ISembrioDao;
import pe.edu.upc.entities.Sembrio;
import pe.edu.upc.serviceinterfaces.ISembrioService;

@Named
public class SembrioServiceImpl implements ISembrioService {
	@Inject
	private ISembrioDao sDao;

	@Override
	public void insert(Sembrio s) {

		sDao.insert(s);
	}

	@Override
	public List<Sembrio> list() {
		// TODO Auto-generated method stub
		return sDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sDao.delete(id);
	}
	
}
