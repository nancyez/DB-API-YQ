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

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers_Pay;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Messages;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.CustomersService;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.Customers_PayService;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.MessagesService;

@RestController
@RequestMapping(path = "/YolistliQuilpalli/Customers")
public class CustomersController {
	
	private CustomersService  customersService;
	// Many to Many relaciones
	private Customers_PayService customers_PayService;
	private MessagesService messagesService;
	
	@Autowired 
	public CustomersController(CustomersService customersService, Customers_PayService customers_PayService,
			MessagesService messagesService) {
		super();
		this.customersService = customersService;
		this.customers_PayService = customers_PayService;
		this.messagesService = messagesService;
	}

	
	// Get All 
	@GetMapping
	public List<Customers> getCustomers(){
		return customersService.getAllCustomers();
	}
	

	// Get individual
	
	@GetMapping("/{id}")
	public Customers getCustomersById(@PathVariable Long id) {
		return customersService.getCustomersById(id); 
	}
	
	// Post 
	
	@PostMapping
	public Customers createCustomers(@RequestBody Customers customers) {
		
		Messages persistentMessages = messagesService.getMessagesById(customers.getMessages().getId_messages());
		Customers_Pay persistentCustomers_Pay = customers_PayService.getCustomers_PayById(customers.getCustomers_Pay().getPay_id());
		
		return customersService.createCustomers(customers); 
	}
	
	
	
	// put
	@PutMapping
	public Customers updateCustomers(@RequestBody Customers customers) {
		return customersService.updateCustomers(customers);
	}

	
	// delete
	
	@DeleteMapping("{id}")
	public void deleteCustomers(@PathVariable Long id) {
		customersService.deleteCustomers(id);
	}


}
