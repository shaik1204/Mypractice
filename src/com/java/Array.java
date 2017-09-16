package com.java;

public class Array {

	public static void main(String[] args) {
		
		
		double [] myList= {10.5,20.3,45.5,71.2};
		
		for (int i = 0; i < myList.length; i++) {
			
			System.out.println(myList[i] +"");
			
		}
		
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		
		System.out.println("the total is"+ total);
		
		
		
	}
	

}
