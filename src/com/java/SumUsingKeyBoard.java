package com.java;

import java.util.Scanner;

public class SumUsingKeyBoard {
	public static void main(String[] args) {

		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.println("enter any two numbers");

		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("sum is:" + c);

	}

}
