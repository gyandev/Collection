package com.gyan.Collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.size());
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println("=======");
		System.out.println(v.capacity());
		v.add("A");	
		System.out.println(v);
	}

}
