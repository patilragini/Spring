package com.bridgelabz.SpringHibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bridgelabz.SpringHibernate.model.Employee;

public class EmployeeDao {
	
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public int save(Employee employee){
		return (Integer) template.save(employee);
	}

	public void update(Employee employee) {
		template.update(employee);
	}
	
	public void delete(Employee employee) {
		template.delete(employee);
	}
	
	public Employee getById(int id) {
		return template.get(Employee.class, id);
	}
	
	public List<Employee> getAll() {
		return template.loadAll(Employee.class);
	}
}
