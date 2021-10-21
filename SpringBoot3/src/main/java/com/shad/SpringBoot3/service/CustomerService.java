package com.shad.SpringBoot3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBoot3.model.Customer;
import com.shad.SpringBoot3.model.Login;
import com.shad.SpringBoot3.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void add(Customer customer) {
		customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public boolean validate(Login login) {

		String email = login.getEmail();
		String password = login.getPassword();

		Customer customer = customerRepository.findByEmailAndPassword(email, password);

		return customer != null;

	}

}
