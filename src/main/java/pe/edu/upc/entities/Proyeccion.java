package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proyeccion")
public class Proyeccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProyeccion;
	
	@Column(name = "TPDetalles", nullable = false, length = 350)
	private String TPDetalles;

	@Column(name = "DFutura", nullable = false)
	private Date DFutura;

	//aqui
	public Proyeccion() {
		super();
	}
	
	public Proyeccion(int idProyeccion, String TPDetalles, Date DFutura) {
		super();
		this.idProyeccion= idProyeccion;
		this.TPDetalles =  TPDetalles;
		this.DFutura = DFutura;
	}
		
	//hasta aquí
	public int getIdProyeccion() {
		return idProyeccion;
	}

	public void setIdProyeccion(int idProyeccion) {
		this.idProyeccion = idProyeccion;
	}

	public String getTPDetalles() {
		return TPDetalles;
	}

	public void setTPDetalles(String tPDetalles) {
		TPDetalles = tPDetalles;
	}

	public Date getDFutura() {
		return DFutura;
	}

	public void setDFutura(Date dFutura) {
		DFutura = dFutura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DFutura, TPDetalles, idProyeccion);
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
		return Objects.equals(DFutura, other.DFutura) && Objects.equals(TPDetalles, other.TPDetalles)
				&& idProyeccion == other.idProyeccion;
	}

	
	
	
}
