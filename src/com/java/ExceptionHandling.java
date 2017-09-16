package com.java;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int a = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("the error is:" + e);
		}
		try {

			int b[] = new int[20];
			System.out.println("the elements are:" + b[30]);

		} catch (ArrayIndexOutOfBoundsException e1) {

			System.out.println("the errror is :" + e1);

		} finally {
			System.out.println("out of block");

		}

	}
}
