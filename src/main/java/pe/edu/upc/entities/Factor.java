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
@Table(name = "Factor")
public class Factor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFactor;

	@ManyToOne
	@JoinColumn(name = "idTipoFactor", nullable = false)
	private TipoFactor tipofactor;

	@Column(name = "QPrecipitacion", nullable = false, length = 20)
	private String QPrecipitacion;
	@Column(name = "QHumedad", nullable = false, length = 20)
	private String QHumedad;
	@Column(name = "QTemperatura", nullable = false, length = 20)
	private String QTemperatura;
	@Column(name = "QFosfato", nullable = false, length = 20)
	private String QFosfato;
	@Column(name = "QNitrato", nullable = false, length = 20)
	private String QNitrato;
	@Column(name = "QSulfato", nullable = false, length = 20)
	private String QSulfato;
	@Column(name = "QPh", nullable = false, length = 20)
	private String QPh;

	public Factor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factor(int idFactor, TipoFactor tipofactor, String QPrecipitacion, String QHumedad, String QTemperatura,
			String QFosfato, String QNitrato, String QSulfato, String QPh) {
		super();
		this.idFactor = idFactor;
		this.tipofactor = tipofactor;
		this.QPrecipitacion = QPrecipitacion;
		this.QHumedad = QHumedad;
		this.QTemperatura = QTemperatura;
		this.QFosfato = QFosfato;
		this.QNitrato = QNitrato;
		this.QSulfato = QSulfato;
		this.QPh = QPh;
	}

	public int getIdFactor() {
		return idFactor;
	}

	public void setIdFactor(int idFactor) {
		this.idFactor = idFactor;
	}

	public TipoFactor getTipofactor() {
		return tipofactor;
	}

	public void setTipofactor(TipoFactor tipofactor) {
		this.tipofactor = tipofactor;
	}

	public String getQPrecipitacion() {
		return QPrecipitacion;
	}

	public void setQPrecipitacion(String qPrecipitacion) {
		QPrecipitacion = qPrecipitacion;
	}

	public String getQHumedad() {
		return QHumedad;
	}

	public void setQHumedad(String qHumedad) {
		QHumedad = qHumedad;
	}

	public String getQTemperatura() {
		return QTemperatura;
	}

	public void setQTemperatura(String qTemperatura) {
		QTemperatura = qTemperatura;
	}

	public String getQFosfato() {
		return QFosfato;
	}

	public void setQFosfato(String qFosfato) {
		QFosfato = qFosfato;
	}

	public String getQNitrato() {
		return QNitrato;
	}

	public void setQNitrato(String qNitrato) {
		QNitrato = qNitrato;
	}

	public String getQSulfato() {
		return QSulfato;
	}

	public void setQSulfato(String qSulfato) {
		QSulfato = qSulfato;
	}

	public String getQPh() {
		return QPh;
	}

	public void setQPh(String qPh) {
		QPh = qPh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(QFosfato, QHumedad, QNitrato, QPh, QPrecipitacion, QSulfato, QTemperatura, idFactor,
				tipofactor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factor other = (Factor) obj;
		return Objects.equals(QFosfato, other.QFosfato) && Objects.equals(QHumedad, other.QHumedad)
				&& Objects.equals(QNitrato, other.QNitrato) && Objects.equals(QPh, other.QPh)
				&& Objects.equals(QPrecipitacion, other.QPrecipitacion) && Objects.equals(QSulfato, other.QSulfato)
				&& Objects.equals(QTemperatura, other.QTemperatura) && idFactor == other.idFactor
				&& Objects.equals(tipofactor, other.tipofactor);
	}
	
	

}
