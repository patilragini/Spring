/*
 * 
 */
package com.bridgelabz.CustomInitDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("/com/bridgelabz/CustomInitDestroy/Bean.xml");
 
        GreetingMessage bean = (GreetingMessage)context.getBean("customLifeCycleMethodBean");
        ((AbstractApplicationContext) context).registerShutdownHook();
      }
}
