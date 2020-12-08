package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.google.common.net.MediaType;


@RestController
@RequestMapping("employee")
public class EmployeeController {
	


	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployees(@RequestBody Employee employee) {
		Employee emp = employeeService.addEmployee(employee);
		return emp;
	}
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.fetchAllEmployees();
	}
	
	@GetMapping(value="{employeeId}")
	public Employee getCustomerById(@PathVariable("employeeId")int id) {
		
		Employee employee=employeeService.fetchEmployeeById(id);
		return employee;
	}
	
	@PutMapping("{employeeId}/{salary}")
	public Employee updateEmployee(@PathVariable("employeeId") int id, @PathVariable("salary") double salary) {
		
		return employeeService.updateEmployee(id, salary);
	}
	
	@DeleteMapping(value="{id}")
	public List<Employee> delete(@PathVariable("id")int id){
		
		List<Employee>list=employeeService.deleteEmployee(id);
		return list;
	}

	
}
