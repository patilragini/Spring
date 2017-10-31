package com.bridgelabz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.spring.lang.Language;
@Service
public class GreatingService {

	@Autowired
	private Language language;
	public GreatingService(){
		
	}
	public void sayGreeting(){
		String greeting=language.getGreeting();
		System.out.println(greeting);
	}
	
}
