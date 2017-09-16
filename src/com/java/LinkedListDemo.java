package com.java;


import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> al= new LinkedList<String>();
		
		al.add("rasool");
		al.add("shaik");
		al.add("munna");
		Iterator itr = al.iterator();
	
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
