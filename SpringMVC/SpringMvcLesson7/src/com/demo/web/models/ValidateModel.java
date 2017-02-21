package com.demo.web.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ValidateModel{
	
	@NotEmpty(message="{name.not.empty}")
	private String name;
	@Range(min=0, max=150,message="{age.not.inrange}")
	private String age;
	@NotEmpty(message="{email.not.empty}")
	@Email(message="{email.not.correct}")
	private String email;
	
}
