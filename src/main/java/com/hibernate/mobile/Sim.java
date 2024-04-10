package com.hibernate.mobile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	
	@Id
	private int id;
	private String provider;
	private long number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Sim [id=" + id + ", provider=" + provider + ", number=" + number + "]";
	}
	
	

}
