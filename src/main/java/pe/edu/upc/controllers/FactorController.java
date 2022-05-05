package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Factor;
import pe.edu.upc.entities.TipoFactor;
import pe.edu.upc.serviceinterfaces.IFactorService;
import pe.edu.upc.serviceinterfaces.ITipoFactorService;

@Named
@RequestScoped
public class FactorController {
	@Inject
	private IFactorService fService;

	@Inject
	private ITipoFactorService tfService;

	private Factor f;
	List<Factor> listaFactores;

	List<TipoFactor> listaTipoFactores;

	@PostConstruct
	public void init() {

		this.f = new Factor();
		this.listaFactores = new ArrayList<Factor>();
		this.listaTipoFactores = new ArrayList<TipoFactor>();
		this.list();
		this.listTipoFactores();
	}

	public void insert() {

		try {
			fService.insert(f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar factores en el controlador");
		}
	}

	public void list() {
		try {
			listaFactores = fService.list();
		} catch (Exception e) {
			System.out.println("Error al listar factores en el controlador");
		}

	}

	public void listTipoFactores() {
		try {
			listaTipoFactores = tfService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipo de factores en el controlador de Factor");
		}

	}
	// modificar

	public String preUpdate(Factor f) {
		this.setF(f);
		return "modificacionFactor.xhtml";
	}

	public void update() {
		try {
			fService.update(this.f);
		} catch (Exception e) {

			System.out.println("Error al modificar factor en el controlador");
		}
	}

	// getter y setters
	public IFactorService getfService() {
		return fService;
	}

	public void setfService(IFactorService fService) {
		this.fService = fService;
	}

	public ITipoFactorService getTfService() {
		return tfService;
	}

	public void setTfService(ITipoFactorService tfService) {
		this.tfService = tfService;
	}

	public Factor getF() {
		return f;
	}

	public void setF(Factor f) {
		this.f = f;
	}

	public List<Factor> getListaFactores() {
		return listaFactores;
	}

	public void setListaFactores(List<Factor> listaFactores) {
		this.listaFactores = listaFactores;
	}

	public List<TipoFactor> getListaTipoFactores() {
		return listaTipoFactores;
	}

	public void setListaTipoFactores(List<TipoFactor> listaTipoFactores) {
		this.listaTipoFactores = listaTipoFactores;
	}

}
