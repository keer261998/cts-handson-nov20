package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public void store() {
		System.out.println("*** store() inside EmployeeService ***");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ***");
	}
	
	public void getEmployee(int n) {
		System.out.println("--- getEmployee() inside EmployeeService ---");
	}
	
	
	public void updateEmployee(int n, String name) {
		System.out.println("--- updateEmployee() inside EmployeeService---");
	}
	
	public void simpleMethod(int n, double d) {
		System.out.println("-- simpleMethod() inside EmployeeService--");
	}
	
	public String simpleMethodTwo(String name) {
		name="Keerthana";
		System.out.println("---simpleMethodTwo() inside EmployeeService--" +name);
		return name; 
	}
	

}
