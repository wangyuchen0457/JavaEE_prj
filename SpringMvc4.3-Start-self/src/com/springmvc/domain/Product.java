package com.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Product {
	private long id;
	private String name;
	private String description;
	private Double price;
}
