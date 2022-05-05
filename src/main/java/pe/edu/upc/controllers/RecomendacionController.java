package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.entities.Recomendacion;
import pe.edu.upc.entities.Tipo;
import pe.edu.upc.serviceinterfaces.IRecomendacionService;
import pe.edu.upc.serviceinterfaces.ITipoService;

@Named
@RequestScoped
public class RecomendacionController {
	@Inject
	private IRecomendacionService rService;
	
	@Inject
	private ITipoService trService;
	
	private Recomendacion r;
	private List<Recomendacion> listaRecomendacion;
	
	private List<Tipo> listaTipoRecomendaciones;
	
	@PostConstruct
	public void init() {
		this.r = new Recomendacion();
		this.listaRecomendacion = new ArrayList<Recomendacion>();
		this.listaTipoRecomendaciones = new ArrayList<Tipo>();
		this.list();
		this.listTipoRecomendaciones();;
		///this.listaTipoRecomendaciones;
	}

	@Transactional
	public String newRecomendacion() {
		this.setR(new Recomendacion());
		return null; //"recomendacion.xhtml" este cambialo por null :v
	}

	@Transactional
	public void insert() {
		try {
			rService.insert(r);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}
	}
	
	public void list() {
		try {
			listaRecomendacion = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}
	
	public void listTipoRecomendaciones() {
		try {
			listaTipoRecomendaciones = trService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipo de recomendaciones en el controlador de Recomendacion");
		}
	}

	@Transactional
	public void delete (Recomendacion re) {
		
		try {
			rService.delete(re.getIdRecomendacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Problemas en el controlador");		}
	}
	// getters & setters

		public IRecomendacionService getrService() {
			return rService;
		}

		public void setrService(IRecomendacionService rService) {
			this.rService = rService;
		}
		
		public ITipoService getTrService() {
			return trService;
		}

		public void setTrService(ITipoService trService) {
			this.trService = trService;
		}

		public Recomendacion getR() {
			return r;
		}

		public void setR(Recomendacion r) {
			this.r = r;
		}

		public List<Recomendacion> getListaRecomendacion() {
			return listaRecomendacion;
		}

		public void setListaRecomendacion(List<Recomendacion> listaRecomendacion) {
			this.listaRecomendacion = listaRecomendacion;
		}
		
		public List<Tipo> getListaTipoRecomendaciones() {
			return listaTipoRecomendaciones;
		}

		public void setListaTipoRecomendaciones(List<Tipo> listaTipoRecomendaciones) {
			this.listaTipoRecomendaciones = listaTipoRecomendaciones;
		}
}
