package com.gyan.Collection;

import java.util.ArrayList;

public class H {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		Object obj=al.remove(3);
		System.out.println(al);
		System.out.println(obj);
		obj=al.remove(10);
		System.out.println(obj);
		
		
		
	}

}
