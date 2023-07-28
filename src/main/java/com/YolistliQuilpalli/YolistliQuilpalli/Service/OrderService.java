package com.YolistliQuilpalli.YolistliQuilpalli.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Order;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.OrderRequest;
import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Products;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.CustomersRepository;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.OrderRepository;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.ProductsRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	private final ProductsRepository productsRepository;
	private final CustomersRepository customersRepository;

	@Autowired
	
	public OrderService(OrderRepository orderRepository, ProductsRepository productsRepository,
			CustomersRepository customersRepository) {
		this.orderRepository = orderRepository;
		this.productsRepository = productsRepository;
		this.customersRepository = customersRepository;
	}
	
	
	// POST METHOD
	
	public Order createOrder(OrderRequest orderRequest) {
		
		// Get data from users and save them
				Long id_products = orderRequest.getId_product();
				Long id_customers = orderRequest.getId_customers();
				String date = orderRequest.getDate();
			    int order_id = orderRequest.getOrder_id(); 

				Products persistentProducts = productsRepository.findById(id_products).orElse(null);
				Customers persistentCustomers = customersRepository.findById(id_customers).orElse(null);

				// Construct and populate a new UserHasBook instance
				Order order = new Order();
		
				order.setProducts(persistentProducts);
				order.setCustomers(persistentCustomers);
				order.setDate(date);
				order.setOrder_id(order_id);
						

				// save it
				return orderRepository.save(order); 
			}
		
		
	}
	
