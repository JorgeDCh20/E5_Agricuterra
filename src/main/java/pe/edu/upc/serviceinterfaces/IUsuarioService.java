package pe.edu.upc.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;


public interface IUsuarioService {

	public void insert(Usuario u);

	public List<Usuario> list();
	
	public void delete(int id);
	
	Optional<Usuario> authentication(Usuario u) throws Exception;
}
