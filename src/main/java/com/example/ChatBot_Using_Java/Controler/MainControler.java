package com.example.ChatBot_Using_Java.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChatBot_Using_Java.Entity.Users;
import com.example.ChatBot_Using_Java.Service.UserService;

@RestController
@RequestMapping("/")
public class MainControler {

	@Autowired
	private UserService service;
	
	
	@PostMapping()
	
	public void postmaping(@RequestBody Users user)
	{
		
		
		service.postdata(user);
	}
	
	
	
	@GetMapping()
	public List<Users> getdata()
	{
		return service.getdata();
	}
	
	@GetMapping("/idget")
	public List<Users> getbyid()
	{
		return service.getbymoreid();
	}
	@GetMapping("/find")
	public List<Users> getmore()
	{
		return service.moresalary();
				}
}
