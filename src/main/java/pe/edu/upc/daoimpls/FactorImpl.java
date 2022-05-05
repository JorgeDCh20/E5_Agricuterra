package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IFactorDao;
import pe.edu.upc.entities.Factor;

public class FactorImpl implements IFactorDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Factor f) {
		try {
			em.persist(f);
		} catch (Exception e) {
			System.out.println("Error al insertar en el dao de factor");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Factor> list() {

		List<Factor> listaFactores = new ArrayList<Factor>();
		try {

			Query jpql = em.createQuery("from Factor f");
			listaFactores = (List<Factor>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de factor");

		}
		return listaFactores;
	}

	@Transactional
	@Override
	public void update(Factor f) {
		
		try {
			em.merge(f);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de vacunaciones");
		}

	}

}
