package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import pe.edu.upc.daointerfaces.IRecoUsuarioDao;

import pe.edu.upc.entities.RecoUsuario;

public class RecoUsuarioImplDao implements IRecoUsuarioDao {
	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(RecoUsuario ru) {
		// TODO Auto-generated method stub
		try {
			em.persist(ru);
		} catch (Exception e) {
			System.out.println("Error al insertar en el dao de RecoUsuario");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RecoUsuario> list() {
		List<RecoUsuario> listaRecoUsuario = new ArrayList<RecoUsuario>();
		try {
			Query jpql = em.createQuery("from RecoUsuario ru");
			listaRecoUsuario = (List<RecoUsuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de RecoUsuario");
		}
		return listaRecoUsuario;
	}

	
	
	
	
}
