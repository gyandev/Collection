package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(9);
		al.add(91);
		al.add(92);
		al.add(93);
		al.add(90);
		al.add(98);
		al.add(99);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=========");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
