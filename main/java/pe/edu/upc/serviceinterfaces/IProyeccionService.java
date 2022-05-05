package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Proyeccion;

public interface IProyeccionService {

	public void insert(Proyeccion y);

	public List<Proyeccion> list();

	public void update(Proyeccion y);
	
	public void delete(int idProyeccion);
	
	public List<Proyeccion> findByNameDetalle(Proyeccion y);
	
	
}
