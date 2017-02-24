package com.ajax.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.models.BookModel;

@Controller
@RequestMapping (value="/test")
public class AjaxController {

	@RequestMapping(value = "/ajax", method = { RequestMethod.GET })
	public String printAjax(Model model) {
		model.addAttribute("bookmodel", new BookModel());
		return "index";
	}

	@RequestMapping(value = "/ajax", method = { RequestMethod.POST })
	public @ResponseBody BookModel printAjax(@RequestBody BookModel bookmodel) {
		String bookName = bookmodel.getBookName();
		String bookSize = bookmodel.getBookSize();
		String bookPages = bookmodel.getBookPages();
		String bookPrice = bookmodel.getBookPrice();

		System.out.println("bookName ="+bookName +"  bookSize="+ bookSize + "  bookPages="+bookPages +"  bookPrice="+ bookPrice);
		return bookmodel;
	}
}
