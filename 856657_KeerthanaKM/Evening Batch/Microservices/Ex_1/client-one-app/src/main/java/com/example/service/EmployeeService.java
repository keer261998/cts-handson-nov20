package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository dao;
	
	public Employee addEmployee(Employee employee) {
		Employee emp = dao.save(employee);
		return emp;
	}
	
	public List<Employee> fetchAllEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		list=dao.findAll();
		return list;
	}
	
	public Employee fetchEmployeeById(int id) {
		Optional<Employee> option = dao.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Employee updateEmployee(int id, double salary) {
		Employee employee = fetchEmployeeById(id);
		if(employee != null) {
			employee.setSalary(salary);
			return dao.save(employee);
		}
		
		else 
			return null;
	}
	
	public List<Employee> deleteEmployee(int id){
		dao.deleteById(id);
		List<Employee> employee = fetchAllEmployees();
		return employee;
		
	}

}
