package com.bridgelabz.SpringHibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.SpringHibernate.model.Employee;
@Transactional
public class EmployeeDao {
	
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Transactional
	public int save(Employee employee){
		return (Integer) template.save(employee);
	}
	@Transactional
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
		System.out.println(template.loadAll(Employee.class));
		return template.loadAll(Employee.class);
	}
}
