package com.shad.SpringBoot3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBoot3.model.Product;
import com.shad.SpringBoot3.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void add(Product product) {

		productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public void edit(Product product) {

		productRepository.save(product);

	}

	public Optional<Product> getProductById(long id) {

		return productRepository.findById(id);
	}

	public void deleteProductById(long id) {

		productRepository.deleteById(id);

	}

}
