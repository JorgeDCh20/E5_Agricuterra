package pe.edu.upc.serviceinterfaces;

import java.util.List;


import pe.edu.upc.entities.RecoUsuario;

public interface IRecoUsuarioService {
	public void insert(RecoUsuario ru);

	public List<RecoUsuario> list();


}
