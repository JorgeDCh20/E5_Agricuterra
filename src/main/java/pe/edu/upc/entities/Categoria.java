package pe.edu.upc.entities;
//util habia aqui
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

}
