package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.DetalleAnalisis;

public interface IDetalleAnalisisDao {
	public void insert(DetalleAnalisis da);

	public List<DetalleAnalisis> list();

	public void update(DetalleAnalisis da);
}
