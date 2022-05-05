package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Sembrio")
public class Sembrio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSembrio;
	
	@Column(name = "NSembrio", nullable = false, length = 47)
	private String NSembrio;
	
	@Column(name = "QTIdeal",nullable = false,length = 46)
	private String QTIdeal;
	
	@Column(name = "QPhIdeal",nullable = false,length = 45)
	private String QPhIdeal;
	
	@Column(name = "QHumedadI",nullable = false,length = 45)
	private String QHumedadI;

	public Sembrio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sembrio(int idSembrio, String NSembrio, String QTIdeal, String QPhIdeal, String QHumedadI) {
		super();
		this.idSembrio = idSembrio;
		this.NSembrio = NSembrio;
		this.QTIdeal = QTIdeal;
		this.QPhIdeal = QPhIdeal;
		this.QHumedadI = QHumedadI;
	}

	public int getidSembrio() {
		return idSembrio;
	}

	public void setidSembrio(int idSembrio) {
		this.idSembrio = idSembrio;
	}

	public String getNSembrio() {
		return NSembrio;
	}

	public void setNSembrio(String NSembrio) {
		this.NSembrio = NSembrio;
	}

	public String getQTIdeal() {
		return QTIdeal;
	}

	public void setQTIdeal(String QTIdeal) {
		this.QTIdeal = QTIdeal;
	}

	public String getQPhIdeal() {
		return QPhIdeal;
	}

	public void setQPhIdeal(String QPhIdeal) {
		this.QPhIdeal = QPhIdeal;
	}
	
	public String getQHumedadI() {
		return QHumedadI;
	}

	public void setQHumedadI(String QHumedadI) {
		this.QHumedadI = QHumedadI;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NSembrio, QHumedadI, QPhIdeal, QTIdeal, idSembrio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sembrio other = (Sembrio) obj;
		return Objects.equals(NSembrio, other.NSembrio) && Objects.equals(QHumedadI, other.QHumedadI)
				&& Objects.equals(QPhIdeal, other.QPhIdeal) && Objects.equals(QTIdeal, other.QTIdeal)
				&& idSembrio == other.idSembrio;
	}
	

}
