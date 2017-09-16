package com.java;

public class JavaMethods1 {

	
	public void m1(){
		System.out.println("m1 method");
	}
	
	public void m1(int a){
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		
		JavaMethods1 j = new JavaMethods1();
		j.m1();
		j.m1(10);

	}

}

// inner methods are not allowed in java
//i.e:one method within the sub method


/*public class Test{
	public void m1(){
		System.out.println("m1 method");
		public void m2(){
			System.out.println("m2 mthod");
		}
	}*/
	
//the above type of inner methods is not allowed in java

//In java void i.e inner method is mandatory in java.. without return type we cannot run the program..







