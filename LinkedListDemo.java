package com.gyan.Collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("gyan");
		l.add(30);
		l.add(null);
		l.add("gyan");
		System.out.println(l);
		l.set(0, "software");
		System.out.println(l);
		l.add(0,"venky");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("ooo");
		System.out.println(l);
		
	}

}
