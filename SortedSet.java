package com.gyan.Collection;

import java.util.TreeSet;

public class SortedSet {
	
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		System.out.println(t);
		Object obj=t.first();
		System.out.println(obj);
		Object obj1=t.last();
		System.out.println(obj1);
		Object obj2=t.headSet(30);
		System.out.println(obj2);
		Object obj3=t.tailSet(30);
		System.out.println(obj3);
		Object obj4=t.subSet(20, 50);
		System.out.println(obj4);
		

	}

}
