package com.bridgelabz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.spring.lang.Language;

/**
 * @author bridgeit
 *
 */
@Service
public class GreatingService {

	@Autowired
	private Language lang;
	public GreatingService(){
		
	}
	public void sayGreeting(){
		String greeting=lang.getGreeting();
		System.out.println(greeting);
	}
	
}
