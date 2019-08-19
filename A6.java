package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(9);
		al.add(100);
		al.add(0);
		al.add(88);
		al.add(78);
		al.add(40);
		al.add("A");
//		al.add(null);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals(9))
			{
				it.remove();
			}
			
		}
		System.out.println("=========");
		System.out.println(al);

}
}