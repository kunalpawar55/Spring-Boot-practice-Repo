package com.example.ChatBot_Using_Java.Controller.Reprositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChatBot_Using_Java.Entity.Chatbotentity;


public interface EntityRepo extends JpaRepository<Chatbotentity, Integer> {

	 List<Chatbotentity> findByQuestionContainingIgnoreCase(String question);
	
}
