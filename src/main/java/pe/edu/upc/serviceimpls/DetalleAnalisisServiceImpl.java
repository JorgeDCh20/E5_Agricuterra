package pe.edu.upc.serviceimpls;

import java.util.List;

import pe.edu.upc.daointerfaces.IDetalleAnalisisDao;
import pe.edu.upc.entities.DetalleAnalisis;
import pe.edu.upc.serviceinterfaces.IDetalleAnalisisService;

public class DetalleAnalisisServiceImpl implements IDetalleAnalisisService {
	private IDetalleAnalisisDao DaDao;

	@Override
	public void insert(DetalleAnalisis da) {
		DaDao.insert(da);
	}

	@Override
	public List<DetalleAnalisis> list() {
		return DaDao.list();
	}

	@Override
	public void update(DetalleAnalisis da) {
		DaDao.update(da);
	}

}
