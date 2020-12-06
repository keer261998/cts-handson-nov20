package com.example.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository dao;
	

	public Customer addCustomer(Customer customer) {
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
	}
	
	public List<Customer> fetchCustomers( ){
		return dao.findAll();
	}
	public Customer fetchCustomer(int id) {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Customer updateCustomer(int id, LocalDate dob) {
		Customer customer = fetchCustomer(id);
		if(customer != null) {
			customer.setDob(dob);
			return dao.save(customer);
		}
		else
			return null;
	}
	
	public List<Customer> deleteCustomer(int id)
	{
		dao.deleteById(id);
		List<Customer> list = fetchCustomers();
		return list;
	}
}
