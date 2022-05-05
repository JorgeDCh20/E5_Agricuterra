package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Proyeccion;

public interface IProyeccionDao {

	public void insert(Proyeccion y);

	public List<Proyeccion> list();

	public void update(Proyeccion y);
	
	public void delete(int idProyeccion);
	
	public List<Proyeccion> findByNameDetalle(Proyeccion y);
}
