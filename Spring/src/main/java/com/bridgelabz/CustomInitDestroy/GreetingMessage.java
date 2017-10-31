/*
 * 
 */
package com.bridgelabz.CustomInitDestroy;

public class GreetingMessage{
	private String name;
    
    public GreetingMessage()
    {
        System.out.println("Constructor of  bean is called !! ");
    }
     
    public void customDestroy() throws Exception {
         
        System.out.println("custom destroy method of  bean is called !! ");
    }
 
    public void customInit() throws Exception {
        System.out.println("custom Init  method of  bean is called !! ");
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

}
            
