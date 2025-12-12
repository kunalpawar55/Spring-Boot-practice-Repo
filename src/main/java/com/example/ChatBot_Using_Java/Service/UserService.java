package com.example.ChatBot_Using_Java.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChatBot_Using_Java.Entity.Users;
import com.example.ChatBot_Using_Java.Repositry.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public void postdata(Users user)
	{
		user.getGender().toLowerCase();
		
		repo.save(user);
	}
	
	public List<Users> getdata(){
		
		return repo.findAll();
	}
	
	public List<Users> getbymoreid()
	{
		return repo.findUsersWithIdGreaterThanFive();
		
	}
	public List<Users> moresalary()
	{
		return repo.findUsersWithMoreSalary();
	}
	public List<Users> findbydate()
	{
		return repo.findUserWithBirtDate();
	}
	
}
