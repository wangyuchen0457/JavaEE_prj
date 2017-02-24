package com.ajax.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class BookModel implements Serializable{
	private static final long serialVersionUID = -4835224895952766346L;
	public BookModel(){}
	private String bookName;
	private String bookSize;
	private String bookPrice;
	private String bookPages;
}
