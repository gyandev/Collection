package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class A13 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("blue");
		al.add("red");
		al.add("white");
		al.add("yellow");
		al.add("indigo");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("-----");
		System.out.println(al);
		int i=Collections.binarySearch(al, "red");
		System.out.println(i);
		System.out.println("===");
		int j=Collections.binarySearch(al,"pink");
		System.out.println(j);
		
		
	}

}
