package com.gyan.Collection;

import java.util.HashSet;

public class A22 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("abc");
		hs.add("abc");
		System.out.println(hs);
		System.out.println("=====");
		hs.add(90);
		hs.add(90);
		System.out.println(hs);
		System.out.println("======");
		hs.add(true);
		hs.add(true);
		System.out.println(hs);
		System.out.println("======");
		hs.add(new StringBuffer("xyz"));
		hs.add(new StringBuffer("xyz"));
		System.out.println(hs);
		System.out.println("====");
		hs.add(new Test2(10,20));
		hs.add(new Test2(10,20));
		System.out.println(hs);
		
		
	}

}
