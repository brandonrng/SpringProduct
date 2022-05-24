package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Product;
import com.hcl.service.ProductService;

@RestController
public class ProductController {
	
	//HAS A
	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public List<Product> getAllProducts(){
		return service.getProducts();
	}
	
	@PostMapping("/")
	public Product createProduct(@RequestBody Product product) {
		return service.createProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable(value = "id") int id) {
		service.deleteProduct(id);
	}
}
