package com.gyan.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe  {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("E");
		v.add("P");
		System.out.println(v);
		Enumeration e=v.elements();
		v.add("Q");
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();
			System.out.println(obj);
		}
		System.out.println(v);
	}

}
