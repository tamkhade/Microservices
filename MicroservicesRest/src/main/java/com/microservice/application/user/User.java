package com.microservice.application.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	
	
	
	
	private int id;
	
	@Size(min=2,message="Name should have at least 2 character")
	private String firstName;
	@Size(min=5)
	private String lastName;
	

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	 

	
}
