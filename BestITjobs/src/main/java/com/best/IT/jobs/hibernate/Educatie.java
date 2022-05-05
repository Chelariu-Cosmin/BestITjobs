package com.best.IT.jobs.hibernate;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity @Table(name="educatie")
public class Educatie {
	@Id
	private int userId;
	private int idEDU;
	private String denumireInstitutie;
	private String denumireSpecializare;
	private Date dataInceput;
	private Date dataSfarsit;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIdEDU() {
		return idEDU;
	}
	public void setIdEDU(int idEDU) {
		this.idEDU = idEDU;
	}
	
	
	public String getDenumireInstitutie() {
		return denumireInstitutie;
	}
	public void setDenumireInstitutie(String denumireInstitutie) {
		this.denumireInstitutie = denumireInstitutie;
	}
	public String getDenumireSpecializare() {
		return denumireSpecializare;
	}
	public void setDenumireSpecializare(String denumireSpecializare) {
		this.denumireSpecializare = denumireSpecializare;
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
	public Educatie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataInceput, dataSfarsit, denumireInstitutie, denumireSpecializare, idEDU, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Educatie other = (Educatie) obj;
		return Objects.equals(dataInceput, other.dataInceput) && Objects.equals(dataSfarsit, other.dataSfarsit)
				&& Objects.equals(denumireInstitutie, other.denumireInstitutie)
				&& Objects.equals(denumireSpecializare, other.denumireSpecializare) && idEDU == other.idEDU
				&& userId == other.userId;
	}
	@Override
	public String toString() {
		return "Educatie [userId=" + userId + ", idEDU=" + idEDU + ", denumireInstitutie=" + denumireInstitutie
				+ ", denumireSpecializare=" + denumireSpecializare + ", dataInceput=" + dataInceput + ", dataSfarsit="
				+ dataSfarsit + "]";
	}
	public Educatie(int userId, int idEDU, String denumireInstitutie, String denumireSpecializare, Date dataInceput,
			Date dataSfarsit) {
		super();
		this.userId = userId;
		this.idEDU = idEDU;
		this.denumireInstitutie = denumireInstitutie;
		this.denumireSpecializare = denumireSpecializare;
		this.dataInceput = dataInceput;
		this.dataSfarsit = dataSfarsit;
	}
	
}
