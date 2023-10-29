package com.project.schoolmanagment.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException{
	//constructor call
	public ConflictException(String message){
		//parent class constructor call
		super(message);
	}
}
