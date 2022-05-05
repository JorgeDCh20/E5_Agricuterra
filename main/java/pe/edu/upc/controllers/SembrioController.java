package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Sembrio;
import pe.edu.upc.serviceinterfaces.ISembrioService;

@Named
@RequestScoped
public class SembrioController {
	@Inject
	private ISembrioService sService;

// atributos
	private Sembrio s;
	private List<Sembrio> listaSembrios;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaSembrios = new ArrayList<Sembrio>();
		this.s = new Sembrio();
		this.list();
	}
//Métodos para atender peticiones

	public String newSembrio() {
		this.setS(new Sembrio());
		return "sembrio.xhtml";
	}

	public void insert() {
		try {
			sService.insert(s);
			
		} catch (Exception e) {

			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}

	}

	public void list() {
		try {
			listaSembrios = sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}
	
	public void delete(Sembrio se) {
		try {
			sService.delete(se.getidSembrio());
			this.list();
		}catch(Exception e){
			System.out.println("Error al eliminar en el controller");
		}
	}

	public ISembrioService getsService() {
		return sService;
	}

	public void setsService(ISembrioService sService) {
		this.sService = sService;
	}

	public Sembrio getS() {
		return s;
	}

	public void setS(Sembrio s) {
		this.s = s;
	}

	public List<Sembrio> getListaSembrios() {
		return listaSembrios;
	}

	public void setListaSembrios(List<Sembrio> listaSembrios) {
		this.listaSembrios = listaSembrios;
	}


	

}
