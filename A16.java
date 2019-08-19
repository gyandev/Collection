package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A16 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(33);
		al.add(44);
		al.add(0);
		al.add(23);
		al.add(56);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		al.add(77);
		System.out.println(al);
	}

}
