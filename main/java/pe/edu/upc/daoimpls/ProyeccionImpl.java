package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IProyeccionDao;
import pe.edu.upc.entities.Proyeccion;

public class ProyeccionImpl implements IProyeccionDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Proyeccion y) {

		try {
			em.persist(y);
		} catch (Exception e) {

			System.out.println("Error al insertar en el dao de proyeccion");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proyeccion> list() {

		List<Proyeccion> listaProyeccion = new ArrayList<Proyeccion>();
		try {
			Query jpql = em.createQuery("from Proyeccion y");
			listaProyeccion = (List<Proyeccion>) jpql.getResultList();
		} catch (Exception e) {

		}

		return listaProyeccion;
	}

	@Transactional
	@Override
	public void update(Proyeccion y) {

		try {
			em.merge(y);
		} catch (Exception e) {

			System.out.println("Error al modificar en el dao de proyeccion");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proyeccion> findByNameDetalle(Proyeccion y) {
		
		List<Proyeccion> lista = new ArrayList<Proyeccion>();
		try {
			
			Query q=em.createQuery("from Proyeccion y where y.Analisis like ?1");
			q.setParameter(1, y.getAnalisis());
			lista= (List<Proyeccion>) q.getResultList();
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar proyeccion en el daoimpl");
		}
		
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int idProyeccion) {

		try {
			Proyeccion py = em.find(Proyeccion.class, idProyeccion);
			em.remove(py);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}

	}

}
