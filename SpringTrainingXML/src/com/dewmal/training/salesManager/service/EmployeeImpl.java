package com.dewmal.training.salesManager.service;

import java.util.List;

import com.dewmal.training.salesManager.model.Employee;
import com.dewmal.training.salesManager.repository.EmployeeRepository;
import com.dewmal.training.salesManager.repository.HibernateEmployeeRepositoryImpl;


public class EmployeeImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


}
