package com.dewmal.training.salesManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dewmal.training.salesManager.model.Employee;
import com.dewmal.training.salesManager.repository.EmployeeRepository;


public class EmployeeImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloded Constructor Executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeImpl() {
		System.out.println("default contructor Executed");
	}
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter Execured");
		this.employeeRepository = employeeRepository;
	}

	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


}
