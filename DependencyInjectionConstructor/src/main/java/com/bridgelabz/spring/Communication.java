package com.bridgelabz.spring;

import com.bridgelabz.spring.domain.Encryption;

public class Communication {
	private Encryption encryption;
    
    /*
     * DI via Constructor Injection
     */
    public Communication(Encryption encryption){
        this.encryption = encryption;
    }
 
 
    public void communicate(){
        encryption.encryptData();
    }
 
	
	
	
	
}
