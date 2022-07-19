import java.util.List;

import com.dewmal.training.salesManager.model.Employee;
import com.dewmal.training.salesManager.service.EmployeeImpl;
import com.dewmal.training.salesManager.service.EmployeeService;

public class Application {
	
	public static void main(String[] args) {
		
		EmployeeService employeeservice = new EmployeeImpl();
		
		List<Employee> employees = employeeservice.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.print(employee.getEmployeeName() +" at "+ employee.getEmployeeLocation());
		}
	}

}
