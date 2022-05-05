package pe.edu.upc.entities;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RecomXUsuario")
public class RecomXUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@ManyToOne
	@JoinColumn(name="idRecomendacion", nullable =false)
	private Recomendacion recomendacion;
	
	@ManyToOne
	@JoinColumn(name = "idTipo", nullable =false)
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable =false)
	private Categoria categoria;
	
	public RecomXUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecomXUsuario(Recomendacion recomendacion, Tipo tipo, Usuario usuario, Categoria categoria) {
		super();
		this.recomendacion = recomendacion;
		this.tipo = tipo;
		this.usuario = usuario;
		this.categoria = categoria;
	}

	public Recomendacion getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, recomendacion, tipo, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecomXUsuario other = (RecomXUsuario) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(recomendacion, other.recomendacion)
				&& Objects.equals(tipo, other.tipo) && Objects.equals(usuario, other.usuario);
	}
	
	
}
