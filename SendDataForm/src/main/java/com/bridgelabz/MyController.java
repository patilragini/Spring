package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView details(@RequestParam(name="name") String name, @RequestParam(name="hobby") String hobby){
		System.out.println("MOdel And View");
		ModelAndView modelAndView = new ModelAndView("welcome");
		Student student = new Student();
		student.setName(name);
		student.setHobby(hobby);		
		modelAndView.addObject("student", student);
		System.out.println(modelAndView);
		return modelAndView;
	}
}
