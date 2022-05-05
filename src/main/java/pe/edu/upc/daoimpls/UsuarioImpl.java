package pe.edu.upc.daoimpls;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;


public class UsuarioImpl implements IUsuarioDao,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	@Override
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
			Usuario u = em.find(Usuario.class, id);
			em.remove(u);
		} catch (Exception e) {
			System.out.println("Problemas tecnicos");

		}
	}

	@Override
	public String getPassworHashedByUserName(String nombreUsuario) {
		Usuario u = new Usuario();

		try {

			Query query = em.createQuery("FROM Usuario u WHERE u.nombreUsuario = ?1");
			query.setParameter(1, nombreUsuario);
			@SuppressWarnings("unchecked")
			List<Usuario> lista = query.getResultList();
			if (!lista.isEmpty()) {
				u = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return u != null ? u.getPasswordUsuario() : "";
	}

	@Override
	public Optional<Usuario> findUserByUsername(Usuario u) {
		Usuario userFound;
		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.nombreUsuario = ?1 and u.passwordUsuario = ?2", Usuario.class);
		query.setParameter(1, u.getNombreUsuario());
		query.setParameter(2, u.getPasswordUsuario());

		userFound = query.getSingleResult();

		return Optional.of(userFound);
	}

}
