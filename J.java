package com.gyan.Collection;

import java.util.ArrayList;

public class J {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add("abc");
		al.add(90.0);
		al.add(true);
		al.add(330);
		System.out.println(al);
		System.out.println("=========");
		ArrayList al1=new ArrayList();
		al1.add(90);
		al1.add("abc");
		al1.add(200);
		al1.add(330);
		System.out.println(al1);
		System.out.println("=========");
		al1.retainAll(al);
		System.out.println(al);
		System.out.println(al1);
		
		
		
	}

}
