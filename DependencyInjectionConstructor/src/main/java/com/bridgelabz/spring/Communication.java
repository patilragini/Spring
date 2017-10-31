package com.bridgelabz.spring;

import com.bridgelabz.spring.domain.Encryption;

public class Communication {
	//interface obj create
	private Encryption encryption;
    
    /*
     * DI via Constructor Injection
     */
    public Communication(Encryption encryption){
        this.encryption = encryption;
    }
 
 //method of Encryption
    public void communicate(){
        encryption.encryptData();
    }
	
}
