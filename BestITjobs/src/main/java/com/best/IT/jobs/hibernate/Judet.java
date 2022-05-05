package com.best.IT.jobs.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity @Table(name="judet")
public class Judet {
	@Id
	private int idJudet;
	private String denumire;

	public int getIdJudet() {
		return idJudet;
	}

	public void setIdJudet(int idJudet) {
		this.idJudet = idJudet;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Judet(int idJudet, String denumire) {
		super();
		this.idJudet = idJudet;
		this.denumire = denumire;
	}

	public Judet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Judet [idJudet=" + idJudet + ", denumire=" + denumire + "]";
	}

}
