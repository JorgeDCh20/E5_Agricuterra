package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoFactor")
public class TipoFactor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipoFactor;
	
	@Column(name = "NTipoFactor", nullable = false, length = 47)
	private String NTipoFactor;

	
	public TipoFactor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TipoFactor(int idTipoFactor, String nTipoFactor) {
		super();
		this.idTipoFactor = idTipoFactor;
		NTipoFactor = nTipoFactor;
	}


	public int getIdTipoFactor() {
		return idTipoFactor;
	}


	public void setIdTipoFactor(int idTipoFactor) {
		this.idTipoFactor = idTipoFactor;
	}


	public String getNTipoFactor() {
		return NTipoFactor;
	}


	public void setNTipoFactor(String nTipoFactor) {
		NTipoFactor = nTipoFactor;
	}
	
	
}
