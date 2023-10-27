package com.project.schoolmanagment.entity.concretes.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_user")
public class User {


	private Long id;

	private String username;

	private String ssn;

	private String name;

	private String surname;

	private LocalDate birthDay;

	private String birthPlace;

	private String password;

	private String phoneNumber;

	private String email;

	private Boolean builtIn;

	private String motherName;

	private String fatherName;

	private int studentNumber;

	private boolean isActive;

	private Boolean isAdvisor;

	private Long advisorTeacherId;



}
