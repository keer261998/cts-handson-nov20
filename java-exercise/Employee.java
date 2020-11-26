package com.example;

import java.time.LocalDate;

public class Employee {

	private int Id;
	private String name;
	private double salary;
	private LocalDate dob;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee[id:"+Id+", name:"+name+", salary:"+salary+", DOB:"+dob+"]";
	}
	
	
	
	
}
