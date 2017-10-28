package com.bridgelabz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	@Autowired
	private MyRepository repository;
	
	public void show()
	{
		System.out.println("Now is :"+repository.getSystemDateTime());
		System.out.println("App name:"+repository.getAppName());
	}

}
