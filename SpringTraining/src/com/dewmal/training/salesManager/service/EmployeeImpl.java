package com.dewmal.training.salesManager.service;

import java.util.List;

import com.dewmal.training.salesManager.model.Employee;
import com.dewmal.training.salesManager.repository.EmployeeRepository;
import com.dewmal.training.salesManager.repository.HibernateEmployeeRepositoryImpl;


public class EmployeeImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


}
