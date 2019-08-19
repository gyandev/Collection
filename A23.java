package com.gyan.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class A23 {
	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(2);
	hs.add(33);
	hs.add(45);
	hs.add(99);
	hs.add(57);
	System.out.println(hs);
	System.out.println("=====");
	TreeSet t=new TreeSet(hs);
	System.out.println(t);
	

}
}
