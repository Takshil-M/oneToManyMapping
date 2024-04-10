package com.hibernate.foodorder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrderBill {
	
	@Id
	private int id;
	private String address;
	private long phone;
	private String customerName;
	
	@OneToMany
	private List<Item> item;

	@Override
	public String toString() {
		return "FoodOrderBill [id=" + id + ", address=" + address + ", phone=" + phone + ", customerName="
				+ customerName + ", item=" + item + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

}
