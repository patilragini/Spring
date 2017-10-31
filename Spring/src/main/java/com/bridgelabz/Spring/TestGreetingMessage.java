/*
 * 
 */
package com.bridgelabz.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGreetingMessage {
	public static void main(String[] args) {
		/*BeanFactory:This interface is implemented by objects that hold a number of bean definitions,
		 * each uniquely identified by a String name.*/
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/com/bridgelabz/Spring/bean.xml"); 
       /* beans are loaded as soon as bean factory instance is created but 
        * the beans are created only when getBean() method is called.
        * getBean: Return an instance, which may be shared*/
        GreetingMessage obj = (GreetingMessage) beanFactory.getBean("greetingMessage");         
        String message = obj.getMessage();
        System.out.println(message);
        }
}	
