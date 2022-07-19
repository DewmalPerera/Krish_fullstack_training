package com.dewmal.training.salesManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dewmal.training.salesManager.model.Employee;
import com.dewmal.training.salesManager.repository.EmployeeRepository;
import com.dewmal.training.salesManager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeImpl implements EmployeeService {
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeImpl() {
		System.out.println("Default Constuctor Excuted");
	}
	
	
	public EmployeeImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded Constructor Executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter Injection Fired");
		this.employeeRepository = employeeRepository;
	}

	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


}
