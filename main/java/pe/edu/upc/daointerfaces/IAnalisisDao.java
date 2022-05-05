package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Analisis;

public interface IAnalisisDao {
	public void insert(Analisis an);

	public List<Analisis> list();

	public void update(Analisis an);
}
