package com.gyan.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		Iterator it=v.iterator();
		Enumeration e=v.elements();
		ListIterator lit=v.listIterator();
		System.out.println(it.getClass().getName());
		System.out.println(e.getClass().getName());
		System.out.println(lit.getClass().getName());
	}

}
