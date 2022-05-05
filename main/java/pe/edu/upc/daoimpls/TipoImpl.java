package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipoDao;
import pe.edu.upc.entities.Tipo;

public class TipoImpl implements ITipoDao{

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	
	public void insert (Tipo t) {
		try {
			em.persist(t);
		} catch (Exception e) {

			System.out.println("Error al insertar Tipoa en el DAO");

		}
	}

	@SuppressWarnings("unchecked")
	
	public List<Tipo> list() {
		List<Tipo> listaTipo = new ArrayList<Tipo>();
		try {
			Query jpql = em.createQuery("from Tipo t");
			listaTipo = (List<Tipo>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Tipoa en DAO");
		}
		return listaTipo;
	}

	@Transactional
	
	public void delete(int id) {
		try {
			Tipo tp = em.find(Tipo.class, id);
			em.remove(tp);
		} catch (Exception e) {
			System.out.println("Problemas tecnicos");

		}
	}
}
