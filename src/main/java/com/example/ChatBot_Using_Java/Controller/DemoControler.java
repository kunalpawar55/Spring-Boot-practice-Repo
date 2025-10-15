package com.example.ChatBot_Using_Java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChatBot_Using_Java.Entity.Chatbotentity;
import com.example.ChatBot_Using_Java.Service.EntityService;

@RestController()
@RequestMapping("/demo")
@CrossOrigin(origins = "http://localhost:3000") // React app ka URL

public class DemoControler {

@Autowired
 EntityService ser;
	
	@PostMapping("/Post")
	public Chatbotentity  postdata(@RequestBody Chatbotentity en)
	{
		return ser.PostData(en);
		
	}
	
	@GetMapping("/getdata")
	public List<Chatbotentity> getalldata() {
	 return	ser.getallData();
	}
	@GetMapping("/search")
	public List<Chatbotentity> searchData(@RequestParam("q") String question) {
	    return ser.searchquestion(question);
	}
		
}
