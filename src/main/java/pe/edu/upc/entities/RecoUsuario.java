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
@Table(name = "RecoUsuario")
public class RecoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecoUsuario;

	@ManyToOne
	@JoinColumn(name = "idPerson", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "idRecomendacion", nullable = false)
	private Recomendacion recomendacion;

	
	public RecoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RecoUsuario(int idRecoUsuario, Usuario usuario, Recomendacion recomendacion) {
		super();
		this.idRecoUsuario = idRecoUsuario;
		this.usuario = usuario;
		this.recomendacion = recomendacion;
	}


	public int getIdRecoUsuario() {
		return idRecoUsuario;
	}


	public void setIdRecoUsuario(int idRecoUsuario) {
		this.idRecoUsuario = idRecoUsuario;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Recomendacion getRecomendacion() {
		return recomendacion;
	}


	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idRecoUsuario, recomendacion, usuario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecoUsuario other = (RecoUsuario) obj;
		return idRecoUsuario == other.idRecoUsuario && Objects.equals(recomendacion, other.recomendacion)
				&& Objects.equals(usuario, other.usuario);
	}

	

}
