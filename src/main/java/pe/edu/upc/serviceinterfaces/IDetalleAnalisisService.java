package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.DetalleAnalisis;

public interface IDetalleAnalisisService {
	public void insert(DetalleAnalisis da);
	public List<DetalleAnalisis> list();
	public void update(DetalleAnalisis da);
}
