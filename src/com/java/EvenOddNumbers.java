package com.java;

import java.util.Scanner;

public class EvenOddNumbers {

public static void main(String[] args) {
		
		/*int a []= new int[] {1,2,3,4,5,6,7,8,9,0};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2==0) {

				System.out.println(a[i] +" is even number");
				}
				else{
					System.out.println(a[i] +"is odd number");
				}
				
			}
		}	*/	

	
	int a;
	System.out.println("enter any number");
	
	Scanner s= new Scanner(System.in);
	a= s.nextInt();
	
	if (a % 2==0) {
		System.out.println("Entered number is even number");
		
	}else{
		System.out.println("Entered number is odd number");
	}
		
	}
	
	
	}

