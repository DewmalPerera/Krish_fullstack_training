package com.dewmal.training.salesManager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.dewmal.training.salesManager.repository.EmployeeRepository;
import com.dewmal.training.salesManager.repository.HibernateEmployeeRepositoryImpl;
import com.dewmal.training.salesManager.service.EmployeeImpl;
import com.dewmal.training.salesManager.service.EmployeeService;

@Configuration
@ComponentScan("com.dewmal")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	//@Scope("singleton")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		//EmployeeImpl employeeService =  new EmployeeImpl(
			//	getEmployeeRepository());
		//employeeService.setEmployeeRepository(getEmployeeRepository());
		EmployeeImpl employeeService =  new EmployeeImpl();
		
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
}
