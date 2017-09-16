package com.java;

public class JavaMethods2 {

//Instance  variables	
int x=100;
int y=200;

//To represent Instance variables use 'this' Keyword
public void add(int x,int y){  //Local Variables
	//static void add(int x,int y)
	//we cannot use this keyword "for mentiond class as static"
	
	System.out.println(x+y);
	System.out.println(this.x+this.y);
}
public static void main(String[] args) {
	
	JavaMethods2 t= new JavaMethods2();
	t.add(1000, 2000);
	
	//Inside the static method 'this keyword not allowed'
	
	//java not supported operator overloading cocept.
	
	//only one + operator
}
}
