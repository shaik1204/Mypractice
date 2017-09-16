package com.java;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		/*int number=20;
		
		switch (number) {
		case 10:System.out.println("10");
		break;
		
		case 20:System.out.println("20");
		break;
		
		case 30: System.out.println("30"); 
		break;
		
		default:System.out.println("not in 10 ,20,30");

		}*/
		
		
		char grade = 'C';
	
	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
		}
	
		
	}


