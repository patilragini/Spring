package com.bridgelabz.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/spring/app-config.xml");
        Communication app = (Communication)context.getBean("communication");
        app.communicate();
    }
}
