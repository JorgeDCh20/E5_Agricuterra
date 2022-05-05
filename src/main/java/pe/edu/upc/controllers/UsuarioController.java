package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;

// atributos
	private Usuario u;
	private List<Usuario> listaUsuario;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaUsuario = new ArrayList<Usuario>();
		this.u = new Usuario();
		this.list();
	}
//Métodos para atender peticiones

	public String newUsuario() {
		this.setU(new Usuario());
		return "usuario.xhtml";
	}

	public void insert() {
		try {
			uService.insert(u);
			
		} catch (Exception e) {

			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}

	}

	public void list() {
		try {
			listaUsuario = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}

	public void delete (Usuario pe) {
		
		try {
			uService.delete(pe.getIdUsuario());
			this.list();
		} catch (Exception e) {
			System.out.println("Prblemas en el controlador");		}
	}
	
	public void findByNameUsuario() {
		try {
			listaUsuario = uService.findByNameUsuario(this.getU());
		} catch (Exception e) {
			System.out.println("Error al buscar el usuario en el controlador");
		}
	}
	
	// getters & setters

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	

}
