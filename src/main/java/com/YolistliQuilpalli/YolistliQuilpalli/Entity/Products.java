package com.YolistliQuilpalli.YolistliQuilpalli.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_products", unique=true, nullable=false)
	private Long id_products;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private Double price;
	
	@Column(nullable=false)
	private int inventory; 
	
	
	//Constructor vacio JPA
		public Products() {
			
		}



	
	/*@ManyToOne
	@JoinTable(
			name="Order",
			joinColumns = @JoinColumn(name="Customers_id_customers"),
			inverseJoinColumns = @JoinColumn(name="Products_id_products")		
			)
	
	private List<Customers> customers;
	
	
	// Nueva anotacion para tabla pivote 
	
	@OneToMany(mappedBy="products")
    @JsonManagedReference(value="products-order")
    	private List<Order> products; */
	

	
	//Getters and setters
	
		public Long getId_products() {
			return id_products;
		}


		public void setId_products(Long id_products) {
			this.id_products = id_products;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public int getInventory() {
			return inventory;
		}


		public void setInventory(int inventory) {
			this.inventory = inventory;
		}
}
