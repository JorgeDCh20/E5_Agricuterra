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
@Table(name="Analisis")
public class Analisis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAnalisis;

	@ManyToOne
	@JoinColumn(name = "idSembrio", nullable = false)
	private Sembrio Sembrio;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario",nullable = false)
	private Usuario Usuario;
	
	@ManyToOne
	@JoinColumn(name = "idFactor",nullable = false)	
	private Factor Factor;
	
	@Column(name = "TAnalisis", nullable = false, length = 350)
	private String TAnalisis;
	
	public Analisis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Analisis(int idAnalisis, pe.edu.upc.entities.Sembrio sembrio, pe.edu.upc.entities.Usuario usuario,
			pe.edu.upc.entities.Proyeccion proyeccion, pe.edu.upc.entities.Factor factor, String tAnalisis) {
		super();
		this.idAnalisis = idAnalisis;
		Sembrio = sembrio;
		Usuario = usuario;
		Factor = factor;
		TAnalisis = tAnalisis;
	}

	public int getIdAnalisis() {
		return idAnalisis;
	}

	public void setIdAnalisis(int idAnalisis) {
		this.idAnalisis = idAnalisis;
	}

	public Sembrio getSembrio() {
		return Sembrio;
	}

	public void setSembrio(Sembrio sembrio) {
		Sembrio = sembrio;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}


	public String getTAnalisis() {
		return TAnalisis;
	}

	public void setTAnalisis(String tAnalisis) {
		TAnalisis = tAnalisis;
	}
		
	public Factor getFactor() {
		return Factor;
	}

	public void setFactor(Factor factor) {
		Factor = factor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Factor, Sembrio, TAnalisis, Usuario, idAnalisis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Analisis other = (Analisis) obj;
		return Objects.equals(Factor, other.Factor) && Objects.equals(Sembrio, other.Sembrio) 
				&& Objects.equals(TAnalisis, other.TAnalisis)
				&& Objects.equals(Usuario, other.Usuario) && idAnalisis == other.idAnalisis;
	}

	

}
