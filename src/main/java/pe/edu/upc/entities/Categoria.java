package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategoria;

	@Column(name = "fullNameCategoria", nullable = false, length = 47)
	private String fullNameCategoria;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idCategoria, String fullNameCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.fullNameCategoria = fullNameCategoria;

	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getFullNameCategoria() {
		return fullNameCategoria;
	}

	public void setFullNameCategoria(String fullNameCategoria) {
		this.fullNameCategoria = fullNameCategoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullNameCategoria, idCategoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(fullNameCategoria, other.fullNameCategoria) && idCategoria == other.idCategoria;
	}

	
}
