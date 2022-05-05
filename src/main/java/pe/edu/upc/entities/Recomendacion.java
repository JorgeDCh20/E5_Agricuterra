package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Recomendacion")
public class Recomendacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecomendacion;
	
	@ManyToOne ////porciaca
	@JoinColumn(name = "idTipo", nullable = false)
	private Tipo tipoReco;

	@Column(name = "NRecomendacion", nullable = false, length = 47)
	private String NRecomendacion;
	
	public Recomendacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recomendacion(int idRecomendacion, Tipo tipoReco, String nRecomendacion) {
		super();
		this.idRecomendacion = idRecomendacion;
		this.tipoReco = tipoReco;
		NRecomendacion = nRecomendacion;
	}

	public int getIdRecomendacion() {
		return idRecomendacion;
	}

	public void setIdRecomendacion(int idRecomendacion) {
		this.idRecomendacion = idRecomendacion;
	}

	public Tipo getTipoReco() {
		return tipoReco;
	}

	public void setTipoReco(Tipo tipoReco) {
		this.tipoReco = tipoReco;
	}

	public String getNRecomendacion() {
		return NRecomendacion;
	}

	public void setNRecomendacion(String nRecomendacion) {
		NRecomendacion = nRecomendacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NRecomendacion, idRecomendacion, tipoReco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recomendacion other = (Recomendacion) obj;
		return Objects.equals(NRecomendacion, other.NRecomendacion) && idRecomendacion == other.idRecomendacion
				&& Objects.equals(tipoReco, other.tipoReco);
	}



}
