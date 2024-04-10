package com.hibernate.mobile;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class InsertMobileSim {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Mobile m = new Mobile();
		m.setId(1);
		m.setName("Apple");
		m.setCost(2000.00);
		
		Sim s1 = new Sim();
		s1.setId(11);
		s1.setNumber(917233747);
		s1.setProvider("jio");
		
		Sim s2 = new Sim();
		s2.setId(12);
		s2.setNumber(774199255);
		s2.setProvider("airtel");
		
		List<Sim> sim = new ArrayList<Sim>();
		sim.add(s2);
		sim.add(s1);
		
		
		m.setSim(sim);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(m);
		entityTransaction.commit();
		
		
	}

}
