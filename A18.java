package com.gyan.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class A18 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(33);
		al.add(44);
		al.add(0);
		al.add(23);
		al.add(56);
		ListIterator lit=al.listIterator();
		al.add(22);
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println(al);
		System.out.println("=====");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		System.out.println(al);
	}

}
