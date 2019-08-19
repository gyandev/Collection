package com.gyan.Collection;

import java.util.ArrayList;

public class L extends ArrayList {
	public static void main(String[] args) {
		L al=new L();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		al.removeRange(2, 4);
		System.out.println(al);
	
}
}
