package pe.edu.upc.daointerfaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	public void insert(Usuario u);
	public List<Usuario> list();
	public void delete(int id);
	public String getPassworHashedByUserName(String nombreUsuario);
	public Optional<Usuario> findUserByUsername(Usuario u);    
}
//package pe.edu.upc.daointerfaces;



