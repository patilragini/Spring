/*
 * 
 */
package com.bridgelabz.Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GreetingMessage implements InitializingBean,DisposableBean{
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
System.out.println("after properties of Bean");	
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroy of Bean");
	
}
}
