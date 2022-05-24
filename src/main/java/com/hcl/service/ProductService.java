package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Product;
import com.hcl.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	public Product createProduct(Product prd) {
		return repo.save(prd);
	}
	
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

}
