package com.gyan.Collection;

import java.util.ArrayList;

public class I {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println(al);
		boolean flag=al.remove(new Integer(20));
		System.out.println(al);
		System.out.println(flag);
		flag=al.remove(new Integer(3));
		System.out.println(flag);
		al.clear();
		System.out.println(al);
		
		
		
	}

}
