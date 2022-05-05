package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Categoria;

public interface ICategoriaDao {
	public void insert(Categoria c);
	public List<Categoria> list();
	public void delete(int id);
}




