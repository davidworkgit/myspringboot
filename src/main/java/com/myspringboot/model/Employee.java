package com.myspringboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Employee {

	private long id;
    private String firstName;
    private String lastName;
    private String emailaddress;

	public Employee() {
	
	}
	
	public Employee(long id, String firstName, String lastName, String emailaddress) {
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.emailaddress = emailaddress;
	}

}
