/*
 * 
 */
package com.bridgelabz.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGreetingMessage {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/bridgelabz/ApplicationContext/bean2.xml");
		GreetingMessage obj = (GreetingMessage) context.getBean("singeltonid");         
        System.out.println(obj);
        obj.setMessage("abc");
        System.out.println(obj.getMessage());
        GreetingMessage obj2 =(GreetingMessage) context.getBean("singeltonid");         
        System.out.println(obj2);
        System.out.println(obj2.getMessage());
        //in singletone bean is destroyed onlu in prototype bean is not distroyed
        ((AbstractApplicationContext) context).registerShutdownHook();
        ((AbstractApplicationContext) context).close();
	}
}	
