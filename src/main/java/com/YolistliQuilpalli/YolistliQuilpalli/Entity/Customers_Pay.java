package com.YolistliQuilpalli.YolistliQuilpalli.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers_Pay")
public class Customers_Pay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pay_id", unique=true, nullable=false)
	private Long pay_id;
	
	@Column(nullable=false)
	private String bank;
	
	@Column(nullable=false)
	private int no_account;
	
	@Column(nullable=false)
	private String expiration_date;
	
	
	// Constructor vacio para JPA
	public Customers_Pay() {
		
	}


	
	// getters and setters 
	public Long getPay_id() {
		return pay_id;
	}


	public void setPay_id(Long pay_id) {
		this.pay_id = pay_id;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public int getNo_account() {
		return no_account;
	}


	public void setNo_account(int no_account) {
		this.no_account = no_account;
	}


	public String getExpiration_date() {
		return expiration_date;
	}


	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	
	

}
