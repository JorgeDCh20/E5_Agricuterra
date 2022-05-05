package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.IProyeccionDao;
import pe.edu.upc.entities.Proyeccion;
import pe.edu.upc.serviceinterfaces.IProyeccionService;

public class ProyeccionServiceImpl implements IProyeccionService{
	
	@Inject
	private IProyeccionDao pyDao;
	
	@Override
	public void insert(Proyeccion y) {
		// TODO Auto-generated method stub
		pyDao.insert(y);
	}

	@Override
	public List<Proyeccion> list() {
		// TODO Auto-generated method stub
		return pyDao.list();
	}

	@Override
	public void update(Proyeccion y) {
		// TODO Auto-generated method stub
		pyDao.update(y);
	}

	@Override
	public void delete(int idProyeccion) {
		// TODO Auto-generated method stub
		pyDao.delete(idProyeccion);
	}

	@Override
	public List<Proyeccion> findByNameDetalle(Proyeccion y) {
		// TODO Auto-generated method stub
		
		return pyDao.findByNameDetalle(y);
	}

}
