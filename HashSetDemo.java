package com.gyan.Collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
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
