package com.bridgelabz.SpringHibernate2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgelabz.SpringHibernate2.model.Employee;

public class EmployeeDao {

	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public int save(Employee employee){
		Session session = factory.openSession();
		Transaction transaction = null;
		int id = 0;
		try {
			transaction = session.beginTransaction();
			id  = (Integer)session.save(employee);
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
}