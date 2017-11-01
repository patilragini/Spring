package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

	@RequestMapping(value="/nameurl", method=RequestMethod.GET)
	public ModelAndView test(@RequestParam(value="uname") String name){
		System.out.println("inside");
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("uname", name);
		return modelAndView;
	}
}
