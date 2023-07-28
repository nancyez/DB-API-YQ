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

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Messages;
import com.YolistliQuilpalli.YolistliQuilpalli.Service.MessagesService;

@RestController
@RequestMapping(path = "/YolistliQuilpalli/Messages")
public class MessagesController {

	@Autowired 
	private MessagesService  messagesService;
	
	public MessagesController(MessagesService messagesService) {
		this.messagesService = messagesService; 
	}
	
	// Get All 
	@GetMapping
	public List<Messages> getMessages(){
		return messagesService.getAllMessagess(); 
	}
	
	
	// Get individual
	
	@GetMapping("/{id}")
	public Messages getMessagesById(@PathVariable Long id) {
		return messagesService.getMessagesById(id); 
	}
	
	// Post 
	
	@PostMapping
	public Messages createMessages(@RequestBody Messages messages) {
		return messagesService.createMessages(messages); 
	}
	
	// put
	@PutMapping
	public Messages updateMessages(@RequestBody Messages messages) {
		return messagesService.updateMessages(messages);
	}

	
	// delete
	
	@DeleteMapping("{id}")
	public void deleteMessages(@PathVariable Long id) {
		messagesService.deleteMessages(id);
	}
}
