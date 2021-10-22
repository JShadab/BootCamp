package com.shad.SpringBoot3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringBoot3.model.Customer;
import com.shad.SpringBoot3.model.Login;
import com.shad.SpringBoot3.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/login")
	public boolean validateCustomer(Login login ) {

		boolean isValidate = customerService.validate(login);

		return isValidate;
	}

	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {

		List<Customer> allCustomers = customerService.getAllCustomers();

		return allCustomers;
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable long id) {

		Optional<Customer> customerOptional = customerService.getCustomerById(id);

		return customerOptional;
	}

	@PostMapping("/customer")
	public Customer saveCustomer(Customer customer) {
		return customerService.add(customer);
	}

	@PutMapping("/customer")
	public Customer editProdcut(Customer customer) {
		return customerService.edit(customer);
	}

	@DeleteMapping("/customer/{id}")
	public void deleteCustomerById(@PathVariable long id) {

		customerService.deleteCustomerById(id);

	}

}
