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

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers_Pay;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.Customers_PayService;



@RestController
@RequestMapping(path = "/YolistliQuilpalli/Customers_Pay")
public class Customers_PayController {
	
	@Autowired 
	private Customers_PayService  customersPayService;
	
	public Customers_PayController(Customers_PayService customersPayService) {
		this.customersPayService = customersPayService; 
	}
	
	// Get All 
	@GetMapping
	public List<Customers_Pay> getCustomers_Pay(){
		return customersPayService.getAllCustomers_Pays(); 
	}
	
	
	// Get individual
	
	@GetMapping("/{id}")
	public Customers_Pay getCustomers_PayById(@PathVariable Long id) {
		return customersPayService.getCustomers_PayById(id); 
	}
	
	// Post 
	
	@PostMapping
	public Customers_Pay createCustomers_Pay(@RequestBody Customers_Pay customersPay) {
		return customersPayService.createCustomers_Pay(customersPay); 
	}
	
	// put
	@PutMapping
	public Customers_Pay updateCustomers_Pay(@RequestBody Customers_Pay customersPay) {
		return customersPayService.updateCustomers_Pay(customersPay);
	}

	
	// delete
	
	@DeleteMapping("{id}")
	public void deleteCustomers_Pay(@PathVariable Long id) {
		customersPayService.deleteCustomers_Pay(id);
	}

}
