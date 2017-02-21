package com.demo.web.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.web.models.FormatModel;

@Controller
@RequestMapping(value = "/format")
public class FormatController {
	//仅留作参考！
	/* @RequestMapping(value="/test", method = {RequestMethod.GET})
	    public String test(Model model) throws NoSuchFieldException, SecurityException{

	        if(!model.containsAttribute("contentModel")){
	            
	            FormatModel formatModel=new FormatModel();

	            CurrencyFormatter currencyFormatter = new CurrencyFormatter();  
	            currencyFormatter.setFractionDigits(2);//保留2位小数
	            currencyFormatter.setRoundingMode(RoundingMode.HALF_UP);//向（距离）最近的一边舍入，如果两边（的距离）是相等的则向上舍入（四舍五入）
	            
	            DateFormatter dateFormatter=new DateFormatter();
	            dateFormatter.setPattern("yyyy-MM-dd HH:mm:ss");
	            
	            DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();  
	            conversionService.addFormatter(currencyFormatter); 
	            conversionService.addFormatter(dateFormatter); 
	            
	            formatModel.setMoney(conversionService.convert(12345.678, String.class));
	            formatModel.setDate(conversionService.convert(new Date(), String.class));    
	            
	            model.addAttribute("contentModel", formatModel);
	        }
	        return "formattest";
	    }*/
	
	
	@RequestMapping(value="/test", method = {RequestMethod.GET})
	public String test(Model model) throws NoSuchFieldException, SecurityException{
		if(!model.containsAttribute("contentModel")){
            
            FormatModel formatModel=new FormatModel();

    		formatModel.setMoney(12345.678);
    		formatModel.setDate(new Date());
            
            model.addAttribute("contentModel", formatModel);
        }
		return "formattest";
	}
	
}
