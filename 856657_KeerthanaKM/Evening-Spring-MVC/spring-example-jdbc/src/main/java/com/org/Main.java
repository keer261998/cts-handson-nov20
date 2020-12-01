package com.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("employeeService");
		//Employee emp = new Employee();
		//emp.setId(101);
		//emp.setName("Keerthana");
		//emp.setSalary(500000);
		//service.storeEmployee(emp);
		
		List<Employee> list = service.fetchAllEmployee();
		list.forEach(e -> System.out.println(e));
	}

}
