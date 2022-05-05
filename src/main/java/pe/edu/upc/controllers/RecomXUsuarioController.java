package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.entities.RecomXUsuario;
import pe.edu.upc.entities.Recomendacion;
import pe.edu.upc.entities.Tipo;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.ICategoriaService;
import pe.edu.upc.serviceinterfaces.IRecomXUsuarioService;
import pe.edu.upc.serviceinterfaces.IRecomendacionService;
import pe.edu.upc.serviceinterfaces.ITipoService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class RecomXUsuarioController {

	@Inject
	private IRecomXUsuarioService ruService;

	@Inject
	private IRecomendacionService rService;

	@Inject
	private ITipoService tService;

	@Inject
	private IUsuarioService uService;

	@Inject
	private ICategoriaService cService;

	private RecomXUsuario ru;
	List<RecomXUsuario> listaRecomXUsuario;

	List<Recomendacion> listaRecomendacion;
	List<Tipo> listaTipo;
	List<Usuario> listaUsuario;
	List<Categoria> listaCategoria;

	@PostConstruct
	public void init() {
		this.ru = new RecomXUsuario();
		this.listaRecomXUsuario = new ArrayList<RecomXUsuario>();
		this.listaRecomendacion = new ArrayList<Recomendacion>();
		this.listaTipo = new ArrayList<Tipo>();
		this.listaUsuario = new ArrayList<Usuario>();
		this.listaCategoria = new ArrayList<Categoria>();
		this.list();
		this.listRecomendacion();
		this.listTipo();
		this.listUsuario();
		this.listCategoria();
	}

	// metodos
	public void insert() {
		try {
			ruService.insert(ru);
		} catch (Exception e) {
			System.out.println("Error al insertar la recomendacion con usuario en el controlador");
		}
	}

	public void list() {
		try {
			listaRecomXUsuario = ruService.list();
		} catch (Exception e) {
			System.out.println("Error al listar la recomendacion con usuario en el controlador");
		}
	}

	public void listRecomendacion() {
		try {
			listaRecomendacion = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar recomendacion en el controlador de vacunacion");
		}
	}

	public void listTipo() {
		try {
			listaTipo = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipo en el controlador de vacunacion");
		}
	}

	public void listUsuario() {
		try {
			listaUsuario = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuario en el controlador de vacunacion");
		}
	}

	public void listCategoria() {
		try {
			listaCategoria = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar categoria en el controlador de vacunacion");
		}
	}

	// modificar

	public String preUpdate(RecomXUsuario ru) {
		this.setRu(ru);
		return "modificacionRecomXUsuario.xhtml";
	}

	public void update() {
		try {
			ruService.update(this.ru);
		} catch (Exception e) {
			System.out.println("Error al modificar la recomendacion con usuario en el controlador");
		}
	}

	// getters and setters
	public RecomXUsuario getRu() {
		return ru;
	}

	public void setRu(RecomXUsuario ru) {
		this.ru = ru;
	}

	public List<RecomXUsuario> getListaRecomXUsuario() {
		return listaRecomXUsuario;
	}

	public void setListaRecomXUsuario(List<RecomXUsuario> listaRecomXUsuario) {
		this.listaRecomXUsuario = listaRecomXUsuario;
	}

	public List<Recomendacion> getListaRecomendacion() {
		return listaRecomendacion;
	}

	public void setListaRecomendacion(List<Recomendacion> listaRecomendacion) {
		this.listaRecomendacion = listaRecomendacion;
	}

	public List<Tipo> getListaTipo() {
		return listaTipo;
	}

	public void setListaTipo(List<Tipo> listaTipo) {
		this.listaTipo = listaTipo;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

}
