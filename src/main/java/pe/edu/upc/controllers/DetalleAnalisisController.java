package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entities.Analisis;
import pe.edu.upc.entities.DetalleAnalisis;
import pe.edu.upc.entities.Factor;
import pe.edu.upc.serviceinterfaces.IAnalisisService;
import pe.edu.upc.serviceinterfaces.IDetalleAnalisisService;
import pe.edu.upc.serviceinterfaces.IFactorService;

@Named
@RequestScoped
public class DetalleAnalisisController {
	@Inject
	private IDetalleAnalisisService daService;
	@Inject
	private IFactorService fService;
	@Inject
	private IAnalisisService anService;

	private DetalleAnalisis da;
	List<DetalleAnalisis> listaDetalleAnalisis;

	List<Factor> listaFactor;
	List<Analisis> listaAnalisis;

	@PostConstruct
	public void init() {
		this.da = new DetalleAnalisis();
		this.listaDetalleAnalisis = new ArrayList<DetalleAnalisis>();
		this.listaAnalisis = new ArrayList<Analisis>();
		this.listaFactor = new ArrayList<Factor>();
		this.list();
		this.listAnalisis();
		this.listaFactor();

	}

	public void insert() {

		try {
			daService.insert(da);
		} catch (Exception e) {
			System.out.println("Error al insertar detalle analisis en el controlador");
		}
	}

	private void list() {
		try {
			listaDetalleAnalisis = daService.list();
		} catch (Exception e) {
			System.out.println("Error al listar detalle analisis en el controlador");
		}

	}

	private void listaFactor() {
		try {
			listaFactor = fService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al listar factor en el controlador");
		}
	}

	private void listAnalisis() {
		// TODO Auto-generated method stub
		try {
			listaAnalisis = anService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al listar analisis en el controlador");
		}
	}

	public String preUpdate(DetalleAnalisis da) {
		this.setDa(da);
		return "mofificarDetalleAnalisis.xhtlm";
	}

	public void update() {
		try {
			daService.update(this.da);
		} catch (Exception e) {
			System.out.println("Error al modificar detalle analisis en el controlador de analisis");
		}
	}

	public IDetalleAnalisisService getDaService() {
		return daService;
	}

	public void setDaService(IDetalleAnalisisService daService) {
		this.daService = daService;
	}

	public IFactorService getfService() {
		return fService;
	}

	public void setfService(IFactorService fService) {
		this.fService = fService;
	}

	public IAnalisisService getAnService() {
		return anService;
	}

	public void setAnService(IAnalisisService anService) {
		this.anService = anService;
	}

	public DetalleAnalisis getDa() {
		return da;
	}

	public void setDa(DetalleAnalisis da) {
		this.da = da;
	}

	public List<DetalleAnalisis> getListaDetalleAnalisis() {
		return listaDetalleAnalisis;
	}

	public void setListaDetalleAnalisis(List<DetalleAnalisis> listaDetalleAnalisis) {
		this.listaDetalleAnalisis = listaDetalleAnalisis;
	}

	public List<Factor> getListaFactor() {
		return listaFactor;
	}

	public void setListaFactor(List<Factor> listaFactor) {
		this.listaFactor = listaFactor;
	}

	public List<Analisis> getListaAnalisis() {
		return listaAnalisis;
	}

	public void setListaAnalisis(List<Analisis> listaAnalisis) {
		this.listaAnalisis = listaAnalisis;
	}

}
