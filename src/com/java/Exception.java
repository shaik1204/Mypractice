package com.java;

public class Exception {

	public static void main(String[] args) {

		try {
			int a = 50 / 0;
			int a1[]=new int [50];
			
			

		} catch (ArithmeticException e) {System.out.println(e);}
		  catch (ArrayIndexOutOfBoundsException e){System.out.println(e);}
		

		System.out.println("rest of the element");

	}

}
