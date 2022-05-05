package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.TipoFactor;

public interface ITipoFactorService {

	public void insert(TipoFactor tf);

	public List<TipoFactor> list();
	
	public void delete (int id);
}
