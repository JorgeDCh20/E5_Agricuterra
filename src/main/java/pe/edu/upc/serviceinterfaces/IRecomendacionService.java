package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Recomendacion;

public interface IRecomendacionService {
	public void insert(Recomendacion r);

	public List<Recomendacion> list();
	
	public void delete(int id);
}
