package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipoFactorDao;
import pe.edu.upc.entities.TipoFactor;

public class TipoFactorImpl implements ITipoFactorDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;
	@Transactional
	@Override
	public void insert(TipoFactor tf) {
		try {
			em.persist(tf);
		} catch (Exception e) {

			System.out.println("Error al insertar tipo factor en el DAO");

		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoFactor> list() {
		List<TipoFactor> listaTipoFactor = new ArrayList<TipoFactor>();
		try {
			Query jpql= em.createQuery("from TipoFactor s");
			listaTipoFactor= (List<TipoFactor>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar TipoFactor en DAO");
		}
		return listaTipoFactor;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		try {
			TipoFactor tfa=em.find(TipoFactor.class, id);
			em.remove(tfa);
		}catch (Exception e) {
			System.out.println("Error al borrar TipoFactor en DAO");
		}
	}


}
