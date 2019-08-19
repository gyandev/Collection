package com.gyan.Collection;

import java.util.LinkedHashSet;

	
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add(null);
		hs.add(true);
		hs.add(10);
		System.out.println(hs);
		System.out.println("=====");
		System.out.println(hs.add("C"));
		
	}

}
