package com.dewmal.training.salesManager.repository;

import java.util.ArrayList;
import java.util.List;

import com.dewmal.training.salesManager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	public List<Employee> getAllEmployees(){
		
		List <Employee> employees = new ArrayList();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Dewmal");
		employee.setEmployeeLocation("Gampaha");
		employees.add(employee);
		
		return employees;
		
	}
}
