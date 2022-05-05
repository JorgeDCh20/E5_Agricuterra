package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ISembrioDao;
import pe.edu.upc.entities.Sembrio;

public class SembrioImpl implements ISembrioDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;
	@Transactional
	@Override
	public void insert(Sembrio s) {
		try {
			em.persist(s);
		} catch (Exception e) {

			System.out.println("Error al insertar sembrio en el DAO");

		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sembrio> list() {
		List<Sembrio> listaSembrios = new ArrayList<Sembrio>();
		try {
			Query jpql= em.createQuery("from Sembrio s");
			listaSembrios= (List<Sembrio>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar sembrio en DAO");
		}
		return listaSembrios;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		try {
			Sembrio sem=em.find(Sembrio.class, id);
			em.remove(sem);
		}catch (Exception e) {
			System.out.println("Error al borrar sembrio en DAO");
		}
	}

}
