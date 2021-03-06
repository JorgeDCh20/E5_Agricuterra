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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;

	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;

	@Column(name = "nombreUsuario", nullable = false, length = 47)
	private String nombreUsuario;

	@Column(name = "passwordUsuario", nullable = false, length = 47)
	private String passwordUsuario;

	@Column(name = "fullNameUsuario", nullable = false, length = 47)
	private String fullNameUsuario;

	@Column(name = "birthDateUsuario", nullable = false)
	private Date birthDateUsuario;

	@Column(name = "specialtyUsuario", nullable = false, length = 46)
	private String specialtyUsuario;

	@Column(name = "companyUsuario", nullable = true, length = 45)
	private String companyUsuario;

	@Column(name = "emailUsuario", nullable = true, length = 45)
	private String emailUsuario;

	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, Categoria categoria, String nombreUsuario, String passwordUsuario,
			String fullNameUsuario, Date birthDateUsuario, String specialtyUsuario, String companyUsuario,
			String emailUsuario, String state) {
		super();
		this.idUsuario = idUsuario;
		this.categoria = categoria;
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
		this.fullNameUsuario = fullNameUsuario;
		this.birthDateUsuario = birthDateUsuario;
		this.specialtyUsuario = specialtyUsuario;
		this.companyUsuario = companyUsuario;
		this.emailUsuario = emailUsuario;
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getFullNameUsuario() {
		return fullNameUsuario;
	}

	public void setFullNameUsuario(String fullNameUsuario) {
		this.fullNameUsuario = fullNameUsuario;
	}

	public Date getBirthDateUsuario() {
		return birthDateUsuario;
	}

	public void setBirthDateUsuario(Date birthDateUsuario) {
		this.birthDateUsuario = birthDateUsuario;
	}

	public String getSpecialtyUsuario() {
		return specialtyUsuario;
	}

	public void setSpecialtyUsuario(String specialtyUsuario) {
		this.specialtyUsuario = specialtyUsuario;
	}

	public String getCompanyUsuario() {
		return companyUsuario;
	}

	public void setCompanyUsuario(String companyUsuario) {
		this.companyUsuario = companyUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}


	@Override
	public int hashCode() {
		return Objects.hash(birthDateUsuario, categoria, companyUsuario, emailUsuario, fullNameUsuario, idUsuario,
				nombreUsuario, passwordUsuario, specialtyUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(birthDateUsuario, other.birthDateUsuario) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(companyUsuario, other.companyUsuario)
				&& Objects.equals(emailUsuario, other.emailUsuario)
				&& Objects.equals(fullNameUsuario, other.fullNameUsuario) && idUsuario == other.idUsuario
				&& Objects.equals(nombreUsuario, other.nombreUsuario)
				&& Objects.equals(passwordUsuario, other.passwordUsuario)
				&& Objects.equals(specialtyUsuario, other.specialtyUsuario);
	}



}
