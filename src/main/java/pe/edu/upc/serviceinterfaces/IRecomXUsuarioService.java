package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.RecomXUsuario;

public interface IRecomXUsuarioService {

	public void insert(RecomXUsuario ru);
	
	public List<RecomXUsuario> list();
	
	public void update(RecomXUsuario ru);
}
