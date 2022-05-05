package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Analisis;
import pe.edu.upc.entities.Proyeccion;
import pe.edu.upc.serviceinterfaces.IAnalisisService;
import pe.edu.upc.serviceinterfaces.IProyeccionService;

@Named
@RequestScoped
public class ProyeccionController {
	@Inject
	private IProyeccionService pService;
	
	@Inject
	private IAnalisisService aService;

	private Proyeccion y;
	List<Proyeccion> listaProyeccion;
	
	List<Analisis> listaAnalisis;

	@PostConstruct
	public void init() {
		this.y = new Proyeccion();
		this.listaProyeccion = new ArrayList<Proyeccion>();
		this.listaAnalisis=new ArrayList<Analisis>();
		this.list();
		this.listAnalisis();
	}


	public void insert() {
		try {
			pService.insert(y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar proyecciones en el controlador");
		}
	}

	private void list() {
		// TODO Auto-generated method stub
		try {
			listaProyeccion = pService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al listar proyecciones en el controlador");
		}

	}

	public void listAnalisis() {
		try {
			listaAnalisis=aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar analisis en el controlador de analisis");
		}	
	}
	
	public void delete(Proyeccion y) {
		try {

			pService.delete(y.getIdProyeccion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller proyeccion");
		}
	}
	// Modificar

	public String preUpdate(Proyeccion y) {
		this.setY(y);
		return "modificacionProyeccion.xhtml";
	}

	public void update() {
		try {
			pService.update(this.y);
		} catch (Exception e) {

			System.out.println("Error al modificar proyeccion en el controlador");
		}
	}

	public void findByNameDetalle() {

		try {
			listaProyeccion = pService.findByNameDetalle(this.getY());
		} catch (Exception e) {
			System.out.println("Error al buscar detalle en el controlador");
		}
	}


	public IProyeccionService getpService() {
		return pService;
	}


	public void setpService(IProyeccionService pService) {
		this.pService = pService;
	}


	public IAnalisisService getaService() {
		return aService;
	}


	public void setaService(IAnalisisService aService) {
		this.aService = aService;
	}


	public Proyeccion getY() {
		return y;
	}


	public void setY(Proyeccion y) {
		this.y = y;
	}


	public List<Proyeccion> getListaProyeccion() {
		return listaProyeccion;
	}


	public void setListaProyeccion(List<Proyeccion> listaProyeccion) {
		this.listaProyeccion = listaProyeccion;
	}


	public List<Analisis> getListaAnalisis() {
		return listaAnalisis;
	}


	public void setListaAnalisis(List<Analisis> listaAnalisis) {
		this.listaAnalisis = listaAnalisis;
	}

	// getter y setters

	

}
