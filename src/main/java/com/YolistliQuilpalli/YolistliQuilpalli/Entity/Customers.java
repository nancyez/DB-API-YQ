package com.YolistliQuilpalli.YolistliQuilpalli.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name= "customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_customers", unique=true, nullable =false)
	private Long id_customers; // tipo de dato Long para evitar problemas con int
	
	//Atributos
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name= "last_name", nullable=false)
	private String last_name;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="birthdate", nullable=false)
	private String birthdate;
	
	@Column(name="promo", nullable=false)
	private String promo;
	
	
	// Constructor vacio para JPA
	public Customers() {
		
	}
	
	// definimos relaciones 
	
	@OneToOne
	@JoinColumn (name="Messages_messages_id", nullable =false)
	private Messages messages; 

    @OneToOne
    @JoinColumn (name="Customers_Pay_pay_id", nullable =false)
    private Customers_Pay customers_Pay;
    
    // Nueva relacion tabla pivote
    
    @OneToMany(mappedBy="customers")
    @JsonManagedReference(value="customers-order")
    private List<Order> customers; 
    
    
	
	@OneToMany
	@JoinTable(
			name="Order",
			joinColumns = @JoinColumn(name="Customers_id_customers"),
			inverseJoinColumns = @JoinColumn(name="Products_id_products")		
			)
	
	// Crear List 
		private List<Products> products;

		public List<Products> getProducts() {
			return products;
		}
		
		
		// Getters And Setters

		public Long getId_customers() {
			return id_customers;
		}

		public void setId_customers(Long id_customers) {
			this.id_customers = id_customers;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

		public String getPromo() {
			return promo;
		}

		public void setPromo(String promo) {
			this.promo = promo;
		}

		public Messages getMessages() {
			return messages;
		}

		public void setMessages(Messages messages) {
			this.messages = messages;
		}

		public Customers_Pay getCustomers_Pay() {
			return customers_Pay;
		}

		public void setCustomers_Pay(Customers_Pay customers_Pay) {
			this.customers_Pay = customers_Pay;
		}

		public List<Order> getCustomers() {
			return customers;
		}

		public void setCustomers(List<Order> customers) {
			this.customers = customers;
		}

		public void setProducts(List<Products> products) {
			this.products = products;
		}

	
		
		
		

		
}
