package com.jsp.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
      @Id
	private int hospitalId;
	private String name;
	private String ceo;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
}
