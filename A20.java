package com.gyan.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class A20 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(23);
		hs.add(34);
		hs.add(56);
		System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
