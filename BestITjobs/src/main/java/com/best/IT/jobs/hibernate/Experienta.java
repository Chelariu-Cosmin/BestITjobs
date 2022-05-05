package com.best.IT.jobs.hibernate;


import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity @Table(name="experienta")
public class Experienta {
	
	@Id
	private int userId;
	private String denumireAngajator;
	private String pozitieOcupata;
	private Date dataInceput;
	private Date dataSfarsit;
	
	
	public String getDenumireAngajator() {
		return denumireAngajator;
	}
	public void setDenumireAngajator(String denumireAngajator) {
		this.denumireAngajator = denumireAngajator;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPozitieOcupata() {
		return pozitieOcupata;
	}
	public void setPozitieOcupata(String pozitieOcupata) {
		this.pozitieOcupata = pozitieOcupata;
	}
	public Date getDataInceput() {
		return dataInceput;
	}
	public void setDataInceput(Date dataInceput) {
		this.dataInceput = dataInceput;
	}
	public Date getDataSfarsit() {
		return dataSfarsit;
	}
	public void setDataSfarsit(Date dataSfarsit) {
		this.dataSfarsit = dataSfarsit;
	}

	public Experienta() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataInceput, dataSfarsit, denumireAngajator, pozitieOcupata, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Experienta other = (Experienta) obj;
		return Objects.equals(dataInceput, other.dataInceput) && Objects.equals(dataSfarsit, other.dataSfarsit)
				&& Objects.equals(denumireAngajator, other.denumireAngajator)
				&& Objects.equals(pozitieOcupata, other.pozitieOcupata) && userId == other.userId;
	}
	public Experienta(int userId, String denumireAngajator, String pozitieOcupata, Date dataInceput, Date dataSfarsit) {
		super();
		this.userId = userId;
		this.denumireAngajator = denumireAngajator;
		this.pozitieOcupata = pozitieOcupata;
		this.dataInceput = dataInceput;
		this.dataSfarsit = dataSfarsit;
	}
	@Override
	public String toString() {
		return "Experienta [userId=" + userId + ", denumireAngajator=" + denumireAngajator + ", pozitieOcupata="
				+ pozitieOcupata + ", dataInceput=" + dataInceput + ", dataSfarsit=" + dataSfarsit + "]";
	}
	
	
}
