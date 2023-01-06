package com.example.demo;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	Date dob;
	public User(Integer id, String name, Date dob) {   // constructor with fields 
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public Integer getId() {  // getters and setters 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {   // toString method 
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	

}
