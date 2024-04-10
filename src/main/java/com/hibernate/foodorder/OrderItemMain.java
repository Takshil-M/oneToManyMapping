package com.hibernate.foodorder;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OrderItemMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Item i1 = new Item();
		i1.setId(101);
		i1.setName("Biryani");
		i1.setQty(4);
		i1.setCost(280.00);
		
		Item i2 = new Item();
		i2.setId(102);
		i2.setName("pizza");
		i2.setQty(2);
		i2.setCost(300.00);
		
		List<Item> item = new ArrayList<Item>();
		item.add(i1);
		item.add(i2);
		
		FoodOrderBill foodOrderBill = new FoodOrderBill();
		foodOrderBill.setId(1);
		foodOrderBill.setAddress("Nagpur");
		foodOrderBill.setCustomerName("Sanket");
		foodOrderBill.setPhone(885529966);
		foodOrderBill.setItem(item);
		
		entityTransaction.begin();
		entityManager.persist(i1);
		entityManager.persist(i2);
		entityManager.persist(foodOrderBill);
		entityTransaction.commit();
		
	
}

}
