package com.YolistliQuilpalli.YolistliQuilpalli.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Messages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="messages_id", unique=true, nullable=false)
	private Long messages_id;
	
	@Column(nullable=false)
	private String affair;
	
	@Column(nullable=false)
	private String message;
	
	// Constructor vacio para JPA
	public Messages() {
		
	}

	
	//Getters And setters
	public Long getId_messages() {
		return messages_id;
	}

	public void setId_messages(Long messages_id) {
		this.messages_id = messages_id;
	}

	public String getAffair() {
		return affair;
	}

	public void setAffair(String affair) {
		this.affair = affair;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
