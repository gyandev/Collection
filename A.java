package com.gyan.Collection;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	    al.add(2,"M");
		al.add("N");
		System.out.println(al);
		
	}

}
