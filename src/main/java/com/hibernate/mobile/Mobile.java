package com.hibernate.mobile;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	
	@Id
	private int id;
	private String name;
	private double cost;
	
	@OneToMany
	private List<Sim> sim;
	
	
	public List<Sim> getSim() {
		return sim;
	}
	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	

}
