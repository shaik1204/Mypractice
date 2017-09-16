package com.java;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter value is a:");
		a=s.nextInt();
		System.out.println("enter value is b:");
		b=s.nextInt();
		
     	c=a;
     	a=b;
	    b=c;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of a is:"+b);
		
		
		
		
		
		
		

	}

}
