package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Sembrio;

public interface ISembrioDao {
	public void insert(Sembrio s);
	public List<Sembrio> list();
	public void delete(int id);
}
