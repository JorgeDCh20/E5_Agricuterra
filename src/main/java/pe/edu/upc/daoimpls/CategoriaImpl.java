package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICategoriaDao;
import pe.edu.upc.entities.Categoria;

public class CategoriaImpl implements ICategoriaDao{

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	
	public void insert (Categoria c) {
		try {
			em.persist(c);
		} catch (Exception e) {

			System.out.println("Error al insertar Categoria en el DAO");

		}
	}

	@SuppressWarnings("unchecked")
	
	public List<Categoria> list() {
		List<Categoria> listaCategoria = new ArrayList<Categoria>();
		try {
			Query jpql = em.createQuery("from Categoria c");
			listaCategoria = (List<Categoria>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Categoria en DAO");
		}
		return listaCategoria;
	}

	@Transactional
	
	public void delete(int id) {
		try {
			Categoria cat = em.find(Categoria.class, id);
			em.remove(cat);
		} catch (Exception e) {
			System.out.println("Problemas tecnicos");

		}
	}
}
