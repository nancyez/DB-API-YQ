package com.YolistliQuilpalli.YolistliQuilpalli.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customers_buy_products")
	private Long customersBuyProducts;

	@Column(name="date")
	private String date;

	@Column(name="order_id")
	private int order_id;
	
	@Column(name="count")
	private int count;
	
	
	// modificador de Customers
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="Products_id_products", nullable=false)
	@JsonBackReference(value="customer-order") // Anotacion para controlar peticiones hacia esta entidad
	private Customers customers;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="Customers_id_customers", nullable=false)
	@JsonBackReference(value="customers-order")
	private Products products;
	
	
	// constructor vacio 
	public Order() {
		super();
	}

	public Long getCustomersBuyProducts() {
		return customersBuyProducts;
	}

	public void setCustomersBuyProducts(Long customersBuyProducts) {
		this.customersBuyProducts = customersBuyProducts;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	

}
