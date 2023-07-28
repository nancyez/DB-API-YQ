package com.YolistliQuilpalli.YolistliQuilpalli.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.CustomersRepository;


@Service
public class CustomersService {
	
	@Autowired
	private CustomersRepository customersRepository; 
	
	// Get
	public List<Customers> getAllCustomers(){
		return customersRepository.findAll();
	}
	
	// Get by id
	public Customers getCustomersById(Long id) {
		return customersRepository.findById(id).orElse(null); 
	}
	
	//Post 
	
	public Customers createCustomers(Customers customers) {
		return customersRepository.save(customers); 
	}
	
	//Put
	public Customers updateCustomers(Customers customers) {
		return customersRepository.save(customers);
	}
	
	
	//Delete
	public void deleteCustomers(Long id) {
		customersRepository.deleteById(id);
	}
	

}
