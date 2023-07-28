package com.YolistliQuilpalli.YolistliQuilpalli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Products;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.ProductsService;

@RestController
@RequestMapping(path = "/YolistliQuilpalli/Products")
public class ProductsController {
	
	@Autowired 
	private ProductsService  productsService;
	
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService; 
	}
	
	// Get All 
	@GetMapping
	public List<Products> getProducts(){
		return productsService.getAllProductss(); 
	}
	
	
	// Get individual
	
	@GetMapping("/{id}")
	public Products getProductsById(@PathVariable Long id) {
		return productsService.getProductsById(id); 
	}
	
	// Post 
	
	@PostMapping
	public Products createProducts(@RequestBody Products products) {
		return productsService.createProducts(products); 
	}
	
	// put
	@PutMapping
	public Products updateProducts(@RequestBody Products products) {
		return productsService.updateProducts(products);
	}

	
	// delete
	
	@DeleteMapping("{id}")
	public void deleteProducts(@PathVariable Long id) {
		productsService.deleteProducts(id);
	}

}
