package pe.edu.upc.entities;

import java.util.Date;
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
@Table(name="DetalleAnalisis")
public class DetalleAnalisis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDetalleAnalisis;

	@ManyToOne
	@JoinColumn(name = "idFactor", nullable = false)
	private Factor factor;
	
	@ManyToOne
	@JoinColumn(name = "idAnalisis", nullable = false)
	private Analisis analisis;

	@Column(name = "DFecha", nullable = false)
	private Date dateAnalisis;

	public DetalleAnalisis() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getIdDetalleAnalisis() {
		return idDetalleAnalisis;
	}



	public void setIdDetalleAnalisis(int idDetalleAnalisis) {
		this.idDetalleAnalisis = idDetalleAnalisis;
	}



	public Factor getFactor() {
		return factor;
	}



	public void setFactor(Factor factor) {
		this.factor = factor;
	}



	public Analisis getAnalisis() {
		return analisis;
	}



	public void setAnalisis(Analisis analisis) {
		this.analisis = analisis;
	}



	public Date getDateAnalisis() {
		return dateAnalisis;
	}



	public void setDateAnalisis(Date dateAnalisis) {
		this.dateAnalisis = dateAnalisis;
	}



	@Override
	public int hashCode() {
		return Objects.hash(analisis, dateAnalisis, factor, idDetalleAnalisis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleAnalisis other = (DetalleAnalisis) obj;
		return Objects.equals(analisis, other.analisis) && Objects.equals(dateAnalisis, other.dateAnalisis)
				&& Objects.equals(factor, other.factor) && idDetalleAnalisis == other.idDetalleAnalisis;
	}

		
	
}
