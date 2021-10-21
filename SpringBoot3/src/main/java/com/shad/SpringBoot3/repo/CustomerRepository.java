package com.shad.SpringBoot3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shad.SpringBoot3.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	Customer findByEmailAndPassword(String email, String password);

}
