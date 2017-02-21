package com.demo.web.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class AccountModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4835224895952766346L;
	private String username;
	private String password;
	
	public AccountModel(){}
	
}
