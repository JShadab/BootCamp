package com.shad.SpringBoot3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shad.SpringBoot3.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
