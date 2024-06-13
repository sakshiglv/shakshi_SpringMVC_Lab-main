package com.SpringBoot.Lab_Assessment_5.EmployeeService;

import java.util.List;
import com.SpringBoot.Lab_Assessment_5.EmployeeEntity.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployees();
   	
    Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

}