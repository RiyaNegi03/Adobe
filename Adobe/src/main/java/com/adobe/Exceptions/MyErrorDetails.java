package com.adobe.Exceptions;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetails {

	private LocalDate localDate;
	private String Message;
	private String Description;
	
}
