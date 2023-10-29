package com.project.schoolmanagment.payload.mappers;

import com.project.schoolmanagment.entity.concretes.user.User;
import com.project.schoolmanagment.payload.request.abstracts.BaseUserRequest;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

	//example of builder design pattern with @SuperBuilder/@Builder annotation
	public User mapUserRequestToUser(BaseUserRequest userRequest){
		return User.builder()
				.username(userRequest.getUsername())
				.name(userRequest.getName())
				.surname(userRequest.getSurname())
				.password(userRequest.getPassword())
				.ssn(userRequest.getSsn())
				.birthDay(userRequest.getBirthDay())
				.birthPlace(userRequest.getBirthPlace())
				.phoneNumber(userRequest.getPhoneNumber())
				.gender(userRequest.getGender())
				.email(userRequest.getEmail())
				.builtIn(userRequest.getBuiltIn())
				.build();
	}



}
