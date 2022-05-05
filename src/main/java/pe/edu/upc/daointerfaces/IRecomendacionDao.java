package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Recomendacion;

public interface IRecomendacionDao {
	public void insert(Recomendacion r);
	public List<Recomendacion> list();
	public void delete(int id);
}
