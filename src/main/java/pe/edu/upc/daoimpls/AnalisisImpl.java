package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IAnalisisDao;
import pe.edu.upc.entities.Analisis;

public class AnalisisImpl implements IAnalisisDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Analisis an) {
		// TODO Auto-generated method stub
		try {
			em.persist(an);
		}catch (Exception e) {
			System.out.println("Error al ingresar en el DAO impl de analisis");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Analisis> list() {
		// TODO Auto-generated method stub
		List<Analisis> listaAnalisis = new ArrayList<Analisis>();
		try {
			Query jpql = em.createQuery("from Analisis an");
			listaAnalisis = (List<Analisis>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar analisis en el DAO Impl");
		}
		return listaAnalisis;
	}
	@Transactional
	@Override
	public void update(Analisis an) {
		try {
			em.merge(an);
		} catch (Exception e) {
			System.out.println("Error al modificar analisis en el DAO Impl");
		}
	}

}
