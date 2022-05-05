package com.best.IT.jobs.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity @Table(name ="rol")

public class Rol {
	@Id
	private int id;
	private String nume;
	public Rol() {
		super();
	}
	public Rol(int id, String nume) {
		super();
		this.id = id;
		this.nume = nume;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
}
