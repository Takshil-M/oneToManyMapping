package com.hibernate.foodorder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOrderDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		FoodOrderBill foodOrderBill=entityManager.find(FoodOrderBill.class, 1);
		System.out.println(foodOrderBill);
		

	}

}
