package com.best.IT.jobs.hibernate;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity @Table(name="adresa")
public class Adresa {
	
	@Id
	private int idLocalitate;
	private int userId;
	private String tara;
	private String strada;
	private int idJudet;
	private String numeLocalitate;
	private int codPostal;

	
	public int getIdJudet() {
		return idJudet;
	}

	public void setIdJudet(int idJudet) {
		this.idJudet = idJudet;
	}

	public String getnumeLocalitate() {
		return numeLocalitate;
	}

	public void setnumeLocalitate(String numeLocalitate) {
		this.numeLocalitate = numeLocalitate;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public int getIdLocalitate() {
		return idLocalitate;
	}

	public void setIdLocalitate(int idLocalitate) {
		this.idLocalitate = idLocalitate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public Adresa(int idLocalitate, int userId, String tara, String strada, int idJudet, String numeLocalitate,
			int codPostal) {
		super();
		this.idLocalitate = idLocalitate;
		this.userId = userId;
		this.tara = tara;
		this.strada = strada;
		this.idJudet = idJudet;
		this.numeLocalitate = numeLocalitate;
		this.codPostal = codPostal;
	}

	public Adresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Adresa [idLocalitate=" + idLocalitate + ", userId=" + userId + ", tara=" + tara + ", strada=" + strada
				+ ", idJudet=" + idJudet + ", denumire=" + numeLocalitate + ", codPostal=" + codPostal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPostal, numeLocalitate, idJudet, idLocalitate, strada, tara, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresa other = (Adresa) obj;
		return codPostal == other.codPostal && Objects.equals(numeLocalitate, other.numeLocalitate) && idJudet == other.idJudet
				&& idLocalitate == other.idLocalitate && Objects.equals(strada, other.strada)
				&& Objects.equals(tara, other.tara) && userId == other.userId;
	}

	
}
