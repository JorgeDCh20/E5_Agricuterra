package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.RecoUsuario;
import pe.edu.upc.entities.Recomendacion;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IRecoUsuarioService;
import pe.edu.upc.serviceinterfaces.IRecomendacionService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class RecoUsuarioController {

	@Inject
	private IRecoUsuarioService ruService;

	@Inject
	private IUsuarioService uService;
	@Inject
	private IRecomendacionService rService;

	private RecoUsuario ru;
	List<RecoUsuario> listaRecoUsuario;

	List<Usuario> listaUsuarios;
	List<Recomendacion> listaRecomendaciones;

	@PostConstruct
	public void init() {
		this.ru = new RecoUsuario();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaRecomendaciones = new ArrayList<Recomendacion>();
		this.list();
		this.listUsuario();
		this.listRecomendaciones();

	}

	private void listRecomendaciones() {
		// TODO Auto-generated method stub
		try {
			listaRecomendaciones = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar reco en el controlador de recomendaciones");
		}
	}

	private void listUsuario() {
		// TODO Auto-generated method stub
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuario en el controlador de recosusario");
		}
	}

	// métodos
	public void insert() {
		try {
			ruService.insert(ru);
		} catch (Exception e) {
			System.out.println("Error al insertar vacunación en el controlador");
		}
	}

	public void list() {
		try {
			listaRecoUsuario = ruService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vacunación en el controlador");
		}
	}

	public IRecoUsuarioService getRuService() {
		return ruService;
	}

	public void setRuService(IRecoUsuarioService ruService) {
		this.ruService = ruService;
	}

	public IUsuarioService getuService() {
		return uService;
	}

	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}

	public IRecomendacionService getrService() {
		return rService;
	}

	public void setrService(IRecomendacionService rService) {
		this.rService = rService;
	}

	public RecoUsuario getRu() {
		return ru;
	}

	public void setRu(RecoUsuario ru) {
		this.ru = ru;
	}

	public List<RecoUsuario> getListaRecoUsuario() {
		return listaRecoUsuario;
	}

	public void setListaRecoUsuario(List<RecoUsuario> listaRecoUsuario) {
		this.listaRecoUsuario = listaRecoUsuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Recomendacion> getListaRecomendaciones() {
		return listaRecomendaciones;
	}

	public void setListaRecomendaciones(List<Recomendacion> listaRecomendaciones) {
		this.listaRecomendaciones = listaRecomendaciones;
	}

		// getters && setters
	
	
}
