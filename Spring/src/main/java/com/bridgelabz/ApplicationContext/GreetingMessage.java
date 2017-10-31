/*
 * 
 */
package com.bridgelabz.ApplicationContext;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GreetingMessage implements InitializingBean,DisposableBean{
private String message;

public GreetingMessage(){
	System.out.println("Constructor of person bean is called !! ");
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
System.out.println("Destroy Bean");	
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("After Properties");
}

}
            
