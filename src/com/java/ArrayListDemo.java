package com.java;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("rasool");
		al.add("shaik");
		al.add("munna");

		Iterator<String> itr = al.iterator();
	
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
