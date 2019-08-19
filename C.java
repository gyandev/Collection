package com.gyan.Collection;

import java.util.ArrayList;

public class C {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add("abc");
		al.add(90.0);
		al.add(true);
		System.out.println(al);
		for(int i=0;i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
