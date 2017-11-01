package com.bridgelabz;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/welcome")
	public ModelAndView sendMessage(){
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("msg" , "Hello By Annotation");
		return modelAndView;
	}
	
	@RequestMapping("/greet/{country}/{name}")
	public ModelAndView greet(@PathVariable Map<String, String> map){
		String country = map.get("country");
		String name = map.get("name");
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("msg", "Hello "+ name + " from " + country);
		return modelAndView;
	}
}
