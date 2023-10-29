package com.project.schoolmanagment.payload.request.abstracts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public abstract class BaseUserRequest extends AbstractUserRequest{

	@NotNull(message = "Please enter your password")
	@Size(min = 8,max = 60,message = "Your password should be between 8-60 characters")
	private String password;

	private Boolean builtIn;
}
