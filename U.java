package com.gyan.Collection;

import java.util.LinkedList;

public class U {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("abc");
		l.add(90);
		l.add("80");
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(100));
	}

}
