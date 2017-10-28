package com.bridgelabz.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.spring.lang.Language;
import com.bridgelabz.spring.lang.impl.Vitenam;
@Configuration
@ComponentScan({"com.bridgelabz.spring.bean"})
public class AppConfiguration {

	public Language getLanguage(){
		return new Vitenam() ;		
	}
}
