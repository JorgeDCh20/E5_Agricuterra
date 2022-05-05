package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.RecomXUsuario;

public interface IRecomXUsuarioDao {

	public void insert(RecomXUsuario ru);
	
	public List<RecomXUsuario> list();
	
	public void update(RecomXUsuario ru);
}
