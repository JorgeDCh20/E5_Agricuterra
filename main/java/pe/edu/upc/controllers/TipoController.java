package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tipo;
import pe.edu.upc.serviceinterfaces.ITipoService;

@Named
@RequestScoped
public class TipoController {
	@Inject
	private ITipoService tService;

// atributos
	private Tipo t;
	private List<Tipo> listaTipo;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaTipo = new ArrayList<Tipo>();
		this.t = new Tipo();
		this.list();
	}
//Métodos para atender peticiones

	public String newTipo() {
		this.setT(new Tipo());
		return "tipo.xhtml";
	}

	public void insert() {
		try {
			tService.insert(t);
			
		} catch (Exception e) {

			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}

	}

	public void list() {
		try {
			listaTipo = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}

	public void delete (Tipo tp) {
		
		try {
			tService.delete(tp.getIdTipo());
			this.list();
		} catch (Exception e) {
			System.out.println("Prblemas en el controlador");		}
	}
	// getters & setters

	public ITipoService gettService() {
		return tService;
	}

	public void settService(ITipoService tService) {
		this.tService = tService;
	}

	public Tipo getT() {
		return t;
	}

	public void setT(Tipo t) {
		this.t = t;
	}

	public List<Tipo> getListaTipo() {
		return listaTipo;
	}

	public void setListaTipo(List<Tipo> listaTipo) {
		this.listaTipo = listaTipo;
	}
	

}
