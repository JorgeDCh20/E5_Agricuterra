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
@Table(name = "Proyeccion")
public class Proyeccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProyeccion;
	
	@Column(name = "DFutura", nullable = false)
	private Date DFutura;
		
	@ManyToOne
	@JoinColumn(name = "idAnalisis", nullable = false)
	private Analisis Analisis;
	
	public Proyeccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Proyeccion(int idProyeccion, Date dFutura, pe.edu.upc.entities.Analisis analisis) {
		super();
		this.idProyeccion = idProyeccion;
		DFutura = dFutura;
		Analisis = analisis;
	}

	public int getIdProyeccion() {
		return idProyeccion;
	}

	public void setIdProyeccion(int idProyeccion) {
		this.idProyeccion = idProyeccion;
	}

	public Date getDFutura() {
		return DFutura;
	}

	public void setDFutura(Date dFutura) {
		DFutura = dFutura;
	}

	public Analisis getAnalisis() {
		return Analisis;
	}

	public void setAnalisis(Analisis analisis) {
		Analisis = analisis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Analisis, DFutura, idProyeccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyeccion other = (Proyeccion) obj;
		return Objects.equals(Analisis, other.Analisis) && Objects.equals(DFutura, other.DFutura)
				&& idProyeccion == other.idProyeccion;
	}	
}
