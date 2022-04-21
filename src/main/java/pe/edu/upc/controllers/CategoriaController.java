package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.serviceinterfaces.ICategoriaService;


@Named
@RequestScoped
public class CategoriaController {
	@Inject
	private ICategoriaService cService;

// atributos
	private Categoria c;
	private List<Categoria> listaCategoria;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaCategoria = new ArrayList<Categoria>();
		this.c = new Categoria();
		this.list();
	}
//Métodos para atender peticiones

	public String newCategoria() {
		this.setC(new Categoria());
		return "Categoria.xhtml";
	}

	public void insert() {
		try {
			cService.insert(c);
			
		} catch (Exception e) {

			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}

	}

	public void list() {
		try {
			listaCategoria = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}

	public void delete (Categoria ca) {
		
		try {
			cService.delete(ca.getIdCategoria());
			this.list();
		} catch (Exception e) {
			System.out.println("Prblemas en el controlador");		}
	}
	// getters & setters

	public ICategoriaService getcService() {
		return cService;
	}

	public void setuService(ICategoriaService cService) {
		this.cService = cService;
	}

	public Categoria getC() {
		return c;
	}

	public void setC(Categoria c) {
		this.c = c;
	}

	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}
	

}
