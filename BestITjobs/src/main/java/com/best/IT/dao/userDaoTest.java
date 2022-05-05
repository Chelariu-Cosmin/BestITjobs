package com.best.IT.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.best.IT.jobs.hibernate.User;

public class userDaoTest {

	
	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BestITjobs");
	        EntityManager entityManager = factory.createEntityManager();
	         
	        entityManager.getTransaction().begin();
	         
	        User newUser = new User();
	        newUser.setUserName("bill Joy");
	        newUser.setPassword("bancoc");
	         
	        entityManager.persist(newUser);
	         
	        entityManager.getTransaction().commit();
	         
	        entityManager.close();
	        factory.close();
	    }
}
