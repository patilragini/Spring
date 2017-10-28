package com.bridgelabz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.spring.bean.GreatingService;
import com.bridgelabz.spring.bean.MyComponent;
import com.bridgelabz.spring.config.AppConfiguration;
import com.bridgelabz.spring.lang.Language;

public class MainProgramAnnotation {
	public static void main(String args[]) {
		// Creating a Context Application object by reading
		// the configuration of the 'AppConfiguration' class.
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		System.out.println("----------");
		Language language = (Language) context.getBean("language");

		System.out.println("Bean Language: " + language);
		System.out.println("Call language.sayBye(): " + language.getBye());

		System.out.println("----------");

		GreatingService service = (GreatingService) context.getBean("greetingService");

		service.sayGreeting();

		System.out.println("----------");

		MyComponent myComponent = (MyComponent) context.getBean("myComponent");

		myComponent.show();
	}
}
