package com.gyan.Collection;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);

	}
}
