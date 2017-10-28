package com.bridgelabz.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	 public static void main(String args[]){
	        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/bridgelabz/spring/App-Config.xml");
	        CommunicationSpring app = (CommunicationSpring)context.getBean("communication");
	        app.communicate();
	    }
}
