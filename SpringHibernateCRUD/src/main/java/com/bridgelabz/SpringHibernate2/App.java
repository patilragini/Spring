package com.bridgelabz.SpringHibernate2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.SpringHibernate2.dao.EmployeeDao;
import com.bridgelabz.SpringHibernate2.model.Employee;

public class App {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("magggi");
		employee.setSalary(20000);		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		
		int id = employeeDao.save(employee);
		
		System.out.println("Employee saved with id: " + id);
		
		employeeDao.showAllEmployee();
		employeeDao.updateCustomer(2,"Pi");
		employeeDao.deleteCustomer(14);
		
		context.close();
	}
}
