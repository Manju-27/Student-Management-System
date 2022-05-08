package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private  String LastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="roll number")
	private int RollNumber;
	
	public Student() {
		
	}
	
	
	
	public Student(Long id, String firstName, String lastName, String email, int rollNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		RollNumber = rollNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	

}
