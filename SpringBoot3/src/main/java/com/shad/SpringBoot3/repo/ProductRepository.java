package com.shad.SpringBoot3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shad.SpringBoot3.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

//	Iterable<Product> findByNameOrderByDesc(String name);
//	
//	Iterable<Product> findByCategoryAndPrice(String category, double price);

}
