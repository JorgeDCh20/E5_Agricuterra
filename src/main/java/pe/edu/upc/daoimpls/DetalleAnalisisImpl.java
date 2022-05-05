package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDetalleAnalisisDao;
import pe.edu.upc.entities.DetalleAnalisis;

public class DetalleAnalisisImpl implements IDetalleAnalisisDao {

	@PersistenceContext(unitName = "agricuterra")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(DetalleAnalisis da) {
		try {
			em.persist(da);
		} catch (Exception e) {
			System.out.println("Error al insertar en el dao de DetalleAnalisis");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleAnalisis> list() {
		List<DetalleAnalisis> listaDetalle_Analisis = new ArrayList<DetalleAnalisis>();
		try {

			Query jpql = em.createQuery("from Factor f");
			listaDetalle_Analisis = (List<DetalleAnalisis>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de factor");

		}
		return listaDetalle_Analisis;
	}

	@Transactional
	@Override
	public void update(DetalleAnalisis da) {
		try {
			em.merge(da);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de vacunaciones");
		}

	}

}
