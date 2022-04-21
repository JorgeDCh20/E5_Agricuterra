package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioImpl implements IUsuarioDao{

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	
	public void insert (Usuario u) {
		try {
			em.persist(u);
		} catch (Exception e) {

			System.out.println("Error al insertar Usuarioa en el DAO");

		}
	}

	@SuppressWarnings("unchecked")
	
	public List<Usuario> list() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		try {
			Query jpql = em.createQuery("from Usuario u");
			listaUsuario = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Usuarioa en DAO");
		}
		return listaUsuario;
	}

	@Transactional
	
	public void delete(int id) {
		try {
			Usuario per = em.find(Usuario.class, id);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Problemas tecnicos");

		}
	}
}
