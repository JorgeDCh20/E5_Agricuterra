package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Tipo;


public interface ITipoService {

	public void insert(Tipo t);

	public List<Tipo> list();
	
	public void delete(int id);
}
