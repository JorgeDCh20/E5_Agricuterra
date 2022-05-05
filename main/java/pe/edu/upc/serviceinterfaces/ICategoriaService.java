package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Categoria;

public interface ICategoriaService {

	public void insert(Categoria c);

	public List<Categoria> list();
	
	public void delete(int id);
}
