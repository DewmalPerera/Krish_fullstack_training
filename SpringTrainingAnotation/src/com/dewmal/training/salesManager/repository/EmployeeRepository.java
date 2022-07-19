package com.dewmal.training.salesManager.repository;

import java.util.List;

import com.dewmal.training.salesManager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}