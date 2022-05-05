package pe.edu.upc.entities;


import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(idTipo, nameTipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo other = (Tipo) obj;
		return idTipo == other.idTipo && Objects.equals(nameTipo, other.nameTipo);
	}

	
	
}
