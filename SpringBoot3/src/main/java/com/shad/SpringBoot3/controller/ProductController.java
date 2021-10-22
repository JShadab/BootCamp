package com.shad.SpringBoot3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringBoot3.model.Product;
import com.shad.SpringBoot3.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProducts() {

		List<Product> allProducts = productService.getAllProducts();

		return allProducts;
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(long id) {

		Optional<Product> productOptional = productService.getProductById(id);

		return productOptional;
	}

	@PostMapping("/product")
	public Product saveProdcut(Product product) {
		return productService.add(product);
	}

	@PutMapping("/product")
	public Product editProdcut(Product product) {
		return productService.edit(product);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(long id) {

		productService.deleteProductById(id);

	}

}
