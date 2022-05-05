package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IRecomendacionDao;
import pe.edu.upc.entities.Recomendacion;

public class RecomendacionImpl implements IRecomendacionDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional

	public void insert(Recomendacion r) {
		try {
			em.persist(r);
		} catch (Exception e) {
			System.out.println("Error al insertar Recomendacion en el DAO");
		}
	}

	@SuppressWarnings("unchecked")

	public List<Recomendacion> list() {
		List<Recomendacion> listaRecomendacion = new ArrayList<Recomendacion>();
		try {
			Query jpql = em.createQuery("from Recomendacion r");
			listaRecomendacion = (List<Recomendacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Recomendacion en DAO");
		}
		return listaRecomendacion;
	}

	@Transactional

	public void delete(int id) {
		try {
			Recomendacion reco = em.find(Recomendacion.class, id);
			em.remove(reco);
		} catch (Exception e) {
			System.out.println("Problemas tecnicos");
		}
	}
	
	
}
