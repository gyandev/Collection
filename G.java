package com.gyan.Collection;

import java.util.ArrayList;

public class G {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add("abc");
		al.add(90.0);
		al.add(true);
		System.out.println(al);
		ArrayList al1=new ArrayList(al);
		al1.add("xyx");
		System.out.println(al1);
		
		
	}

}
