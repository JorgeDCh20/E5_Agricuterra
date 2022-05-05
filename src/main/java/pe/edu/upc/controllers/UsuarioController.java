package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.entities.Usuario;

import pe.edu.upc.serviceinterfaces.ICategoriaService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;

	@Inject
	private ICategoriaService cService;
// atributos
	private Usuario u;
	List<Usuario> listaUsuario;

	List<Categoria> listaCategoria;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaUsuario = new ArrayList<Usuario>();
		this.listaCategoria = new ArrayList<Categoria>();
		this.u = new Usuario();
		this.list();
		this.listCategoria();		
			
	}

//Métodos para atender peticiones

	public String newUsuario() {
		this.setU(new Usuario());
		return "usuario.xhtml";
	}

	public void insert() {
		try {
			uService.insert(u);
			String password = this.u.getPasswordUsuario();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.u.setPasswordUsuario(passwordHash);
		
			

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

	public void delete(Usuario pe) {

		try {
			uService.delete(pe.getIdUsuario());
			this.list();
		} catch (Exception e) {
			System.out.println("Prblemas en el controlador");
		}
	}

	private void listCategoria() {
		try {
			listaCategoria = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipo de factores en el controlador de Factor");
		}
	}
	// getters & setters

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public ICategoriaService getcService() {
		return cService;
	}

	public void setcService(ICategoriaService cService) {
		this.cService = cService;
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

	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

	
}
