package com.gyan.Collection;

import java.util.ArrayList;

public class F {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add("abc");
		al.add(90.0);
		al.add(true);
		System.out.println(al);
		al.add("xyz");
		System.out.println(al);
		al.add(2,"check");
		System.out.println(al);
		System.out.println("=========");
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.addAll(1,al);
		System.out.println(al);
		System.out.println(al1);
	}

}
