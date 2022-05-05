package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IRecomXUsuarioDao;
import pe.edu.upc.entities.RecomXUsuario;

public class RecomXUsuarioImpl implements IRecomXUsuarioDao {
	
	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insert(RecomXUsuario ru) {
		// TODO Auto-generated method stub
		try {
			em.persist(ru);
		} catch (Exception e) {
			System.out.println("Error al insertar el registro de recomendacion con el usuario");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RecomXUsuario> list() {
		
		List<RecomXUsuario> listaRecomXUsuario = new ArrayList<RecomXUsuario>();
		try {
			Query jpql = em.createQuery("from RecomXUsuario ru");
			listaRecomXUsuario = (List<RecomXUsuario>)jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao las recomendaciones con usuario");
		}
		return listaRecomXUsuario;
	}

	@Transactional
	@Override
	public void update(RecomXUsuario ru) {
		try {
			em.merge(ru);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao las recomendaciones con usuario");
		}
	}

}
