package com.YolistliQuilpalli.YolistliQuilpalli.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Messages;
import com.YolistliQuilpalli.YolistliQuilpalli.Repository.MessagesRepository;

@Service
public class MessagesService {
	
	
	@Autowired
	private MessagesRepository messagesRepository; 
	
	// Get
	public List<Messages> getAllMessagess(){
		return messagesRepository.findAll();
	}
	
	// Get by id
	public Messages getMessagesById(Long id) {
		return messagesRepository.findById(id).orElse(null); 
	}
	
	//Post 
	
	public Messages createMessages(Messages messages) {
		return messagesRepository.save(messages); 
	}
	
	//Put
	public Messages updateMessages(Messages messages) {
		return messagesRepository.save(messages);
	}
	
	//Delete
	public void deleteMessages(Long id) {
		messagesRepository.deleteById(id);
	}

}
