package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

	@After("execution(public * com.org.EmployeeService.st*(..))")
	public void log() {
		
		System.out.println("--log method 1 is called--");
		
	}
	
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void log2() {
		System.out.println("-- log method 2 is called--");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int,*))")
	public void log3() {
		System.out.println("--log method 3 is called--");
		
	}
	
	@After("execution(public * com.org.EmployeeService.*(int,String))")
	public void log4() {
		System.out.println("--log method 4 is called--");
		
	}
	
	@After("execution(public * com.org.EmployeeService.*(String))")
	public void log5() {
		System.out.println("-- log method 5 is called--");
	}
	
	
}
