package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.TipoFactor;

public interface ITipoFactorDao {

	public void insert(TipoFactor tf);

	public List<TipoFactor> list();

	public void delete(int id);
}
