package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class O {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(9);
		al.add("abc");
		al.add(91);
		al.add(90);
		al.add(92);
		al.add(93);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
