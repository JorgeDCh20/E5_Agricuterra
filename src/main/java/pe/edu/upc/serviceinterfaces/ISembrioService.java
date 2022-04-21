package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Sembrio;

public interface ISembrioService {

	public void insert(Sembrio s);

	public List<Sembrio> list();
	
	public void delete (int id);
}
