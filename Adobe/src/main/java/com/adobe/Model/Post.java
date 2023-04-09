package com.adobe.Model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class Post {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
//		(unique identifier)
		
		
		private int  user_id;
//		(foreign key referencing the User model)
		
		@Size(min = 1, max = 300, message = "{validation.name.size}")
		private String content; 
//		(string, 1-300 characters)
		
		 private LocalDateTime created_at;
//		 (timestamp, automatically set when the post is created)
		
		private LocalDateTime updated_at;
//		 (timestamp, automatically updated when the post is updated)
		
		
		private int likes;
//		(integer, non-negative)
	
}
