package com.bridgelabz.SpringHibernate2.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.SpringHibernate2.model.Employee;

public class EmployeeDao {
	@Autowired
	private static SessionFactory sessionFactory;

	public SessionFactory getFactory() {
		return sessionFactory;
	}

	public void setFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public int save(Employee employee) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		int id = 0;
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return id;

	}

	public static void showAllEmployee() {
		Session session = sessionFactory.openSession();
		Employee cust = new Employee();
		TypedQuery<Employee> query = session.createQuery("from  Employee E ");		
		List<Employee> customer = query.getResultList();
		for(int i=0;i<customer.size();i++){
		System.out.println(customer.get(i));
		}
		System.out.println("no of rows affected:" + customer.size());
		session.close();		
		
			}

	public static void updateCustomer(int customerId, String newNmae) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			// update whewre age = 21
			System.out.println(Employee.class);
			Employee emp = session.get(Employee.class, customerId);
			emp.setName(newNmae);
			session.update(emp);
			transaction.commit();
		} catch (Exception e) {
			if (null != transaction) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	public static void deleteCustomer(int customerId) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Employee emp = session.get(Employee.class, customerId);
			session.delete(emp);
			transaction.commit();
		} catch (Exception e) {
			if (null != transaction) {
				transaction.commit();
			}
		} finally {
			session.close();
		}
	}
}