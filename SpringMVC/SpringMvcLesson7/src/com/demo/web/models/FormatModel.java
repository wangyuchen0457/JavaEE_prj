package com.demo.web.models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class FormatModel{
	
	@NumberFormat(style=Style.CURRENCY)
	private double money;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date date;
		
}
