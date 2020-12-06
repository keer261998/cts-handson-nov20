package com.example.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Customer;
import com.example.Service.CustomerService;


@RequestMapping("customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		Customer createdCustomer = customerService.addCustomer(customer);
		return createdCustomer;
	}
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.fetchCustomers();
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int id) {
		Customer customer = customerService.fetchCustomer(id);
		return customer;
	}
	
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDob(@PathVariable("customerId") int id, @PathVariable("dob") String stringDob) {
		return customerService.updateCustomer(id, LocalDate.parse(stringDob));
	}
	
	@DeleteMapping("{customerId}")
	public List<Customer> deleteCustomer(@PathVariable("customerId") int id)
	{
		List<Customer> list=customerService.deleteCustomer(id);
		return list;
	}
	
}
