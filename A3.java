package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(35);
		al.add(31);
		al.add(46);
		al.add(98);
		System.out.println(al);
		Iterator it=al.iterator();
//		System.out.println(it);
		System.out.println("=======");
		while(it.hasNext())
		{
			Integer I=(Integer)it.next();
			System.out.println(I);
	//		System.out.println("====");
	//		System.out.println(it.next());
			if(I%2==0)
			{
				it.remove();
				
			}
		
		}
		System.out.println("===");
		System.out.println(al);
	
		System.out.println("======");
		ListIterator lit=al.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
	}

}
