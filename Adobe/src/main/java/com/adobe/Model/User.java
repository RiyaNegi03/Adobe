package com.adobe.Model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min = 1, max = 150, message = "{validation.name.size}")
	private String name;
//	(string, 1-50 characters)
	
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String email;
//	(string, valid email format)
	
	@Size(min = 1, max = 200, message = "{validation.name.size}")
	private String bioString;
//	(optional string, 0-200 characters)
	
	private LocalDateTime created_at;
//	(timestamp, automatically set when the user is created)
	
	
	private LocalDateTime updated_at;
//	(timestamp, automatically updated when the user is updated)
	
	
}
