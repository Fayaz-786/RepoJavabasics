package com.technoelevate.employeemanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.employeemanagement.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public boolean register(Employee employee) {
		boolean isRegistered=false;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("employee");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(employee);
		
		
		transaction.commit();
		isRegistered=true;
		
	
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isRegistered;
	}
	
}
