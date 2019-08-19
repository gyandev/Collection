package com.gyan.Collection;

import java.util.ArrayList;

public class D {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add("abc");
		al.add(90.0);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("========");
		for(int i=0;i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("========");
		for(Object obj:al)
		{
			System.out.println(obj + "");
		}
		
	}

}
