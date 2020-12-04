package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		int n=10;
		String name="Lila";
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		//service.getAllEmployee();
		service.getEmployee(n);
		service.updateEmployee(n, "Keerthana");
		service.simpleMethod(n, 23456);
		service.simpleMethodTwo(name);
	}

}
