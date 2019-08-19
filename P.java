package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(9);
		al.add(19);
		al.add(91);
		al.add(90);
		al.add(92);
		al.add(93);
		System.out.println(al);
		Comparator ctr=Collections.reverseOrder();
		Collections.sort(al,ctr);
		System.out.println(al);
		
	}

}
