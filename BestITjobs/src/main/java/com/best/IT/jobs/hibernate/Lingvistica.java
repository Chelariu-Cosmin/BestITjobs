package com.best.IT.jobs.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity @Table(name="lingvistica")
public class Lingvistica {

	@Id
	private int userId;
	private int idLimba;
	private String denumireLimba;
	private String nivel;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIdLimba() {
		return idLimba;
	}
	public void setIdLimba(int idLimba) {
		this.idLimba = idLimba;
	}
	public String getDenumireLimba() {
		return denumireLimba;
	}
	public void setDenumireLimba(String denumireLimba) {
		this.denumireLimba = denumireLimba;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Lingvistica(int userId, int idLimba, String denumireLimba) {
		super();
		this.userId = userId;
		this.idLimba = idLimba;
		this.denumireLimba = denumireLimba;
	}
	public Lingvistica() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lingvistica [userId=" + userId + ", idLimba=" + idLimba + ", denumireLimba=" + denumireLimba
				+ ", nivel=" + nivel + "]";
	}
	
}
