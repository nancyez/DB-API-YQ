package com.YolistliQuilpalli.YolistliQuilpalli.Entity;

//DTO 
public class OrderRequest {
	
	private Long id_customers;
	private Long id_product; 
	private String date; 
	private int order_id; 
	private int count;
	
	
	
	// Getters and Setters
	
	
	public Long getId_customers() {
		return id_customers;
	}
	public void setId_customers(Long id_customers) {
		this.id_customers = id_customers;
	}
	public Long getId_product() {
		return id_product;
	}
	public void setId_product(Long id_product) {
		this.id_product = id_product;
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
	

	
	
	
	
	
	
	
	
	

}
