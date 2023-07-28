package com.YolistliQuilpalli.YolistliQuilpalli.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers_Pay;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.Customers_PayRepository;

@Service
public class Customers_PayService {
	
	
	@Autowired
	private Customers_PayRepository customers_PayRepository; 
	
	// Get
	public List<Customers_Pay> getAllCustomers_Pays(){
		return customers_PayRepository.findAll();
	}
	
	// Get by id
	public Customers_Pay getCustomers_PayById(Long id) {
		return customers_PayRepository.findById(id).orElse(null); 
	}
	
	//Post 
	
	public Customers_Pay createCustomers_Pay(Customers_Pay customers_Pay) {
		return customers_PayRepository.save(customers_Pay); 
	}
	
	//Put
	public Customers_Pay updateCustomers_Pay(Customers_Pay customers_Pay) {
		return customers_PayRepository.save(customers_Pay);
	}
	
	
	//Delete
	public void deleteCustomers_Pay(Long id) {
		customers_PayRepository.deleteById(id);
	}

}
