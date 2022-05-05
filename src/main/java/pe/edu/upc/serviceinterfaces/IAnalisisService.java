package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Analisis;

public interface IAnalisisService {

	public void insert(Analisis an);
	public List<Analisis> list();
	public void update(Analisis an);
}
