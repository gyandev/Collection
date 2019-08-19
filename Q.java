package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Q {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add("ABC");
		al.add("123");
		al.add("xyz");
		al.add("aBC");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println("al:" +al.size());
		
	}

}
