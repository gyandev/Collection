package com.gyan.Collection;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(true);
		System.out.println(al);
		int i=(Integer)al.get(0);
		boolean b=(Boolean)al.get(1);
		System.out.println(i);
		System.out.println(b);
	}

}
