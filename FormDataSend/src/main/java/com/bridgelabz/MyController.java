package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="/save.html", method=RequestMethod.POST)
	public ModelAndView details(@RequestParam(name="name") String name, @RequestParam(name="hobby") String hobby){
		ModelAndView modelAndView = new ModelAndView("welcome");
		Student student = new Student();
		student.setName(name);
		student.setHobby(hobby);
		
		modelAndView.addObject("student", student);
		return modelAndView;
	}
}
