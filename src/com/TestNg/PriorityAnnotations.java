package com.TestNg;

import org.testng.annotations.Test;



public class PriorityAnnotations {
	
	@Test(priority=1)
	public void registerEmail(){
		
		System.out.println("email registered succefully");
	}
	
	@Test(priority=2)
public void sendEmail(){
		System.out.println("email sent successfully");
	}
	
	@Test(priority=3)
	public void logOut(){
		System.out.println("logout succefully");
	}
}
