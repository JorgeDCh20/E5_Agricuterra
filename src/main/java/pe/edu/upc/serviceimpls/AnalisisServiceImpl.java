package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IAnalisisDao;
import pe.edu.upc.entities.Analisis;
import pe.edu.upc.serviceinterfaces.IAnalisisService;

@Named
public class AnalisisServiceImpl implements IAnalisisService {

	@Inject
	private IAnalisisDao anDao;
	@Override
	public void insert(Analisis an) {
		// TODO Auto-generated method stub
		anDao.insert(an);
	}

	@Override
	public List<Analisis> list() {
		// TODO Auto-generated method stub
		return anDao.list();
	}

	@Override
	public void update(Analisis an) {
		// TODO Auto-generated method stub
		anDao.update(an);
	}

}
