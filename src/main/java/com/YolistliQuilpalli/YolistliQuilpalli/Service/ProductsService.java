package com.YolistliQuilpalli.YolistliQuilpalli.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Products;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository; 
	
	// Get
	public List<Products> getAllProductss(){
		return productsRepository.findAll();
	}
	
	// Get by id
	public Products getProductsById(Long id) {
		return productsRepository.findById(id).orElse(null); 
	}
	
	//Post 
	
	public Products createProducts(Products products) {
		return productsRepository.save(products); 
	}
	
	//Put
	public Products updateProducts(Products products) {
		return productsRepository.save(products);
	}
	
	//Delete
	public void deleteProducts(Long id) {
		productsRepository.deleteById(id);
	}

}
