package com.example.ChatBot_Using_Java.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChatBot_Using_Java.Controller.Reprositery.EntityRepo;
import com.example.ChatBot_Using_Java.Entity.Chatbotentity;

@Service
public class EntityService {

	@Autowired
	private EntityRepo repo;
	
	
	public Chatbotentity PostData(Chatbotentity en)
	{
		 return repo.save(en);
		 
	}
	public List<Chatbotentity> getallData()
	{
		return repo.findAll();
		
	}
	public List<Chatbotentity> searchquestion(String questiom)
	{
		return repo.findByQuestionContainingIgnoreCase(questiom);
		
	}
	
	
}
