package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Proyeccion;
import pe.edu.upc.serviceinterfaces.IProyeccionService;

@Named
@RequestScoped
public class ProyeccionController {
	@Inject
	private IProyeccionService pService;

	//atributos
	private Proyeccion y;
	private List<Proyeccion> listaProyeccion;

	@PostConstruct
	public void init() {

		this.listaProyeccion = new ArrayList<Proyeccion>();
		this.y = new Proyeccion();
		this.list();
	}

	public void insert() {

		try {
			pService.insert(y);
		} catch (Exception e) {
			System.out.println("Error al insertar proyecciones en el controlador");
		}
	}

	private void list() {
		// TODO Auto-generated method stub
		try {
			listaProyeccion = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar proyecciones en el controlador");
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

	// getter y setters
	public IProyeccionService getpService() {
		return pService;
	}

	public void setpService(IProyeccionService pService) {
		this.pService = pService;
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

}
