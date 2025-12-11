package com.example.ChatBot_Using_Java.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ChatBot_Using_Java.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,Long> {

	@Query(value = "select * from users where id >5" ,nativeQuery = true)
	List<Users>findUsersWithIdGreaterThanFive();
	@Query(value = "select * from users where salary>(select salary from users where id=9)",nativeQuery = true)
	List<Users> findUsersWithMoreSalary();
	
	
}
