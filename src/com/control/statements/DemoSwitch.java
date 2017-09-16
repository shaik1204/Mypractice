package com.control.statements;

public class DemoSwitch {
	//he Java switch statement executes one statement from multiple conditions
	public static void main(String[] args) {

		int marks = 40;

		switch (marks) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
		default:
			System.out.println("not in 10 or not in 20");
			break;
		}
	}

}
