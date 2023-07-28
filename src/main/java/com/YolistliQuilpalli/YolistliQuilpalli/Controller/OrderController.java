package com.YolistliQuilpalli.YolistliQuilpalli.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Order;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.OrderRequest;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.OrderService;

@RestController
@RequestMapping(path = "/YolistliQuilpalli/Order")
public class OrderController {
	
	
	private final OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	// OrderRequest es un DTO
		// Data Transfer Object, solamente se utilizan para el proceso de transferencias
		@PostMapping
		public Order createOrder(@RequestBody OrderRequest orderRequest) {
			return orderService.createOrder(orderRequest); 
		}
	
	
	

	

}
