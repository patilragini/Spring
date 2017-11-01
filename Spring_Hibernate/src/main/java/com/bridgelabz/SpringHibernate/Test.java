package com.bridgelabz.SpringHibernate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.SpringHibernate.dao.EmployeeDao;
import com.bridgelabz.SpringHibernate.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("ragini");
		employee.setSalary(32000);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		employeeDao.save(employee);
		System.out.print(employeeDao.save(employee));
		
		context.close();
	}
}
