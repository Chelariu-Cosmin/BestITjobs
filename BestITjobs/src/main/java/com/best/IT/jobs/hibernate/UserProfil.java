package com.best.IT.jobs.hibernate;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "userProfil")
public class UserProfil extends User {

	
	@ManyToOne
	int userId;
	private int numarMobil;
	private String despreMine;
	private String sex;
	private String permisConducere;
	private String pathDocumente;
	private String pathPhoto;

	public String getPermisConducere() {
		return permisConducere;
	}

	public void setPermisConducere(String permisConducere) {
		this.permisConducere = permisConducere;
	}

	public String getPathDocumente() {
		return pathDocumente;
	}

	public void setPathDocumente(String pathDocumente) {
		this.pathDocumente = pathDocumente;
	}

	public String getPathPhoto() {
		return pathPhoto;
	}

	public void setPathPhoto(String pathPhoto) {
		this.pathPhoto = pathPhoto;
	}

	public int getNumarMobil() {
		return numarMobil;
	}

	public void setNumarMobil(int numarMobil) {
		this.numarMobil = numarMobil;
	}

	public String getDespreMine() {
		return despreMine;
	}

	public void setDespreMine(String despreMine) {
		this.despreMine = despreMine;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public UserProfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(despreMine, numarMobil, pathDocumente, pathPhoto, permisConducere, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfil other = (UserProfil) obj;
		return Objects.equals(despreMine, other.despreMine) && numarMobil == other.numarMobil
				&& Objects.equals(pathDocumente, other.pathDocumente) && Objects.equals(pathPhoto, other.pathPhoto)
				&& Objects.equals(permisConducere, other.permisConducere) && Objects.equals(sex, other.sex);
	}

	@Override
	public String toString() {
		return "UserProfil [numarMobil=" + numarMobil + ", despreMine=" + despreMine + ", sex=" + sex
				+ ", permisConducere=" + permisConducere + ", pathDocumente=" + pathDocumente + ", pathPhoto="
				+ pathPhoto + "]";
	}

	public UserProfil(int numarMobil, String despreMine, String sex, String permisConducere, String pathDocumente,
			String pathPhoto) {
		super();
		this.numarMobil = numarMobil;
		this.despreMine = despreMine;
		this.sex = sex;
		this.permisConducere = permisConducere;
		this.pathDocumente = pathDocumente;
		this.pathPhoto = pathPhoto;
	}

}
