package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Analisis;
import pe.edu.upc.entities.Factor;
import pe.edu.upc.entities.Sembrio;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IAnalisisService;
import pe.edu.upc.serviceinterfaces.IFactorService;
import pe.edu.upc.serviceinterfaces.ISembrioService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class AnalisisController {

	@Inject
	private IAnalisisService anService;
	
	@Inject
	private ISembrioService sService;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IFactorService fService;

	
	private Analisis an;
	List<Analisis> listaAnalisis;
	
	List<Sembrio> listaSembrios;
	List<Usuario> listaUsuarios;
	List<Factor> listaFactores;

	
	@PostConstruct
	public void init() {
		this.an=new Analisis();
		this.listaAnalisis=new ArrayList<Analisis>();
		this.listaSembrios=new ArrayList<Sembrio>();
		this.listaUsuarios=new ArrayList<Usuario>();
		this.listaFactores=new ArrayList<Factor>();
		this.list();
		this.listSembrios();
		this.listUsuarios();
		this.listFactores();
}
	//métodos
	public void insert() {
		try {
			anService.insert(an);
		} catch (Exception e) {
			System.out.println("Error al insertar analisis en el controlador");
		}
	}
	
	public void list() {
		try {
			listaAnalisis=anService.list();
		} catch (Exception e) {
			System.out.println("Error al listar analisis en el controlador");
		}
	}
	
	public void listSembrios() {
		try {
			listaSembrios=sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar sembrios en el controlador de analisis");
		}	
	}
	
	public void listUsuarios() {
		try {
			listaUsuarios=uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de analisis");
		}	
	}
	
	public void listFactores() {
		try {
			listaFactores=fService.list();
		} catch (Exception e) {
			System.out.println("Error al listar factores en el controlador de analisis");
		}
	}
	
	
	//modificar
	
	public String preUpdate(Analisis an) {
		this.setAn(an);
		return "modificacionAnalisis.xhtlm";
	}
	
	public void update() {
		try {
			anService.update(this.an);
		} catch (Exception e) {
			System.out.println("Error al modificar analisis en el controlador de analisis");
		}
	}
	public IAnalisisService getAnService() {
		return anService;
	}
	public void setAnService(IAnalisisService anService) {
		this.anService = anService;
	}
	public ISembrioService getsService() {
		return sService;
	}
	public void setsService(ISembrioService sService) {
		this.sService = sService;
	}
	public IUsuarioService getuService() {
		return uService;
	}
	public void setuService(IUsuarioService uService) {
		this.uService = uService;
	}
	public IFactorService getfService() {
		return fService;
	}
	public void setfService(IFactorService fService) {
		this.fService = fService;
	}
	public Analisis getAn() {
		return an;
	}
	public void setAn(Analisis an) {
		this.an = an;
	}
	public List<Analisis> getListaAnalisis() {
		return listaAnalisis;
	}
	public void setListaAnalisis(List<Analisis> listaAnalisis) {
		this.listaAnalisis = listaAnalisis;
	}
	public List<Sembrio> getListaSembrios() {
		return listaSembrios;
	}
	public void setListaSembrios(List<Sembrio> listaSembrios) {
		this.listaSembrios = listaSembrios;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public List<Factor> getListaFactores() {
		return listaFactores;
	}
	public void setListaFactores(List<Factor> listaFactores) {
		this.listaFactores = listaFactores;
	}
			
}
