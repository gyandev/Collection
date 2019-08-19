package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A14 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(12);
		al.add(55);
		System.out.println(al);
		Comparator ctr=Collections.reverseOrder();
		Collections.sort(al, ctr);
		System.out.println(al);
		System.out.println("-----");
		int i=Collections.binarySearch(al, 10,ctr);
		System.out.println(i);
		System.out.println("===");
		int j=Collections.binarySearch(al,100,ctr);
		System.out.println(j);
		
		
	}

}
