package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class SpringBootController {
	@Value("${book.author}")
	private String bookAuthor;
	
	@Value("${book.name}")
	private String bookName;
	
	@RequestMapping("/index")
	public String index(){
		return "book name is:" + bookName + ",book author is:" + bookAuthor;
	}

}
