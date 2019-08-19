package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class A2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(98);
		al.add(78);
		al.add(99);
		al.add(900);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
	}

}
