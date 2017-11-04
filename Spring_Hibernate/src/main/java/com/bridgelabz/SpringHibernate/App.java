package com.bridgelabz.SpringHibernate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.SpringHibernate.dao.EmployeeDao;
import com.bridgelabz.SpringHibernate.model.Employee;

public class App {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Nilesh Karle");
		employee.setSalary(40000);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		int id = employeeDao.save(employee);
		System.out.println("Employee saved with id: " + id);
		
		
		context.close();
	}
}
