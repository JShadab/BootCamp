package com.shad.SpringBoot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBoot2.dao.CustomerDAO;
import com.shad.SpringBoot2.model.Customer;
import com.shad.SpringBoot2.model.Login;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public void add(Customer customer) {
		customerDAO.add(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerDAO.findAll();
	}

	public boolean validate(Login login) {

		String email = login.getEmail();
		String password = login.getPassword();

		Customer customer = customerDAO.getCustomerByEmailAndPassword(email, password);

		return customer != null;

	}

}
