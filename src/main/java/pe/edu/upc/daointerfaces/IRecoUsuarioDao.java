package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.RecoUsuario;


public interface IRecoUsuarioDao {

	public void insert(RecoUsuario ru);

	public List<RecoUsuario> list();

}
