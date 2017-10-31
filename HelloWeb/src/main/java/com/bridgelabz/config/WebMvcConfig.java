package com.bridgelabz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	public void addReourceHandlers(ResourceHandlerRegistry registery){
		registery.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(35698520);
		registery.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(35698520);
		registery.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(35698520);
		System.out.println("here  addReourceHandlers");
	}

	public void configDefaultServletHandler(DefaultServletHandlerConfigurer config){
		config.enable();
		System.out.println("here configDefaultServletHandler");
	}
	
	
}
