package com.gyan.Collection;

import java.util.LinkedList;

public class W {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(9);
		l.add(90);
		l.add(21);
		l.add(89);
		l.add(88);
		l.add(123);
		System.out.println(l);
		Object obj=l.removeFirst();
		System.out.println(obj);
		System.out.println(l);
		Object obj1=l.removeLast();
		System.out.println(obj1);
		System.out.println(l);
	
	}

}
