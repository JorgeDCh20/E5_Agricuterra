package pe.edu.upc.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipo;

	@Column(name = "nameTipo", nullable = false, length = 47)
	private String nameTipo;


	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo(int idTipo, String nameTipo) {
		super();
		this.idTipo = idTipo;
		this.nameTipo = nameTipo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getnameTipo() {
		return nameTipo;
	}

	public void setnameTipo(String nameTipo) {
		this.nameTipo = nameTipo;
	}

	
}
