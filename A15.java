package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A15 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(33);
		al.add(44);
		al.add(0);
		al.add(23);
		al.add(56);
		Iterator it=al.iterator();
		al.add(77);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(al);
	}

}
