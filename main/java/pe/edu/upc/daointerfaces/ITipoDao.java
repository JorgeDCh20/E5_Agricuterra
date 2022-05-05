package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Tipo;

public interface ITipoDao {
	public void insert(Tipo t);
	public List<Tipo> list();
	public void delete(int id);
}
//package pe.edu.upc.daointerfaces;



