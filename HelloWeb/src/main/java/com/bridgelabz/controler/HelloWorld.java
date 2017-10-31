package com.bridgelabz.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloWorld {	
	
	@RequestMapping(value="/hello")
	public  String hello(Model model){
		System.out.println("hello");
		model.addAttribute("greeting","Hello Spring Mvc");		
		return "helloworld";		
	}
}
