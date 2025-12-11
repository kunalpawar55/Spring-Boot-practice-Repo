package com.example.ChatBot_Using_Java.Entity;

import java.util.Collection;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;  

    private String name;

    private String email;

    private String gender;

    private String dateOfBirth; 

    private int salary;

    public Users() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Users(String name, String email, String gender, String dateOfBirth, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", salary=" + salary + "]";
	}
    


}
