package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeePrimaryInfo;
import com.capgemini.springrest.exceptions.EmployeeException;
@Repository
public class EmployeeDAOImple implements EmployeeDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeePrimaryInfo auth(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo bean) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "update EmployeePrimaryInfo e set e.name =:name where e.id = :id";
			Query query = manager.createQuery(jpql);
			query.setParameter("id", bean.getId());
			query.setParameter("name", bean.getName());
			int id = query.executeUpdate();

			transaction.commit();
			isUpdated = true;

		} catch (Exception e) {
			// TODO: handle exceptionentityClass
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isUpdated;


	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo employeeInfoBean = manager.find(EmployeePrimaryInfo.class, id);
		if (employeeInfoBean != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded = true;
			System.out.println("Added");
		} catch (Exception e) {
			// TODO: handle exceptionentityClass
			e.printStackTrace();
			throw new EmployeeException("Employee ID already exists!");
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public List<EmployeePrimaryInfo> getALLInfo() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "Select e from EmployeePrimaryInfo e";
		Query query = manager.createQuery(jpql);
		List<EmployeePrimaryInfo> record = query.getResultList();
		return record;
	}

	@Override
	public EmployeePrimaryInfo getEmployeeDetails(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo employeeInfoBean = manager.find(EmployeePrimaryInfo.class, id);
		manager.close();
		return employeeInfoBean;
	}

}
