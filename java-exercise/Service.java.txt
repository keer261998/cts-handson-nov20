package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	List<Employee> employeeList = new ArrayList<Employee>();
	
	public void add(Employee e) {
		employeeList.add(e);
	}
	
	public void findEmployeeById(int id ) {
		
		for(Employee emp:employeeList) {
			if(emp.getId()==id) {
				System.out.println(emp);
			}
		}
	}
	
	public void showEmployees() {
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void showSortedEmployeeById() {
		Collections.sort(employeeList,(e1,e2)->e1.getId()-e2.getId());
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void showSortedEmployeeByName() {
		Collections.sort(employeeList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void showSortedEmployeeBySalary() {
		Collections.sort(employeeList,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void showSortedEmployeeByDob() {
		Collections.sort(employeeList,(e1,e2)->e1.getDob().compareTo(e2.getDob()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
}
