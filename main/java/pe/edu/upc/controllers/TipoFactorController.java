package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoFactor;
import pe.edu.upc.serviceinterfaces.ITipoFactorService;

@Named
@RequestScoped
public class TipoFactorController {
	@Inject
	private ITipoFactorService tfService;

// atributos
	private TipoFactor tf;
	private List<TipoFactor> listaTipoFactor;

	// inicializar
	@PostConstruct
	public void init() {
		this.setListaTipoFactor(new ArrayList<TipoFactor>());
		this.tf = new TipoFactor();
		this.list();
	}
//Métodos para atender peticiones

	public String newTipoFactor() {
		this.setTf(new TipoFactor());
		return "sembrio.xhtml";
	}

	public void insert() {
		try {
			tfService.insert(tf);
			
		} catch (Exception e) {

			System.out.println("Error al insertar TipoFactor en el controller" + e.getStackTrace());
		}

	}

	public void list() {
		try {
			setListaTipoFactor(tfService.list());
		} catch (Exception e) {
			System.out.println("Error al listar TipoFactor en el controller");
		}
	}
	
	public void delete(TipoFactor tf) {
		try {
			tfService.delete(tf.getIdTipoFactor());
			this.list();
		}catch(Exception e){
			System.out.println("Error al eliminar TipoFactor en el controller");
		}
	}

	public ITipoFactorService getTfService() {
		return tfService;
	}

	public void setTfService(ITipoFactorService tfService) {
		this.tfService = tfService;
	}

	public TipoFactor getTf() {
		return tf;
	}

	public void setTf(TipoFactor tf) {
		this.tf = tf;
	}

	public List<TipoFactor> getListaTipoFactor() {
		return listaTipoFactor;
	}

	public void setListaTipoFactor(List<TipoFactor> listaTipoFactor) {
		this.listaTipoFactor = listaTipoFactor;
	}
	

}
