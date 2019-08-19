package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BinarySearch implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Integer I1=(Integer)arg0;
		Integer I2=(Integer)arg1;
		return I1.compareTo(I2);
	}
	
}
public class BinarySearchDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(21);
		al.add(34);
		al.add(4);
		al.add(32);
		al.add(90);
		Collections.sort(al,new BinarySearch());
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 10,new BinarySearch()));
		System.out.println(Collections.binarySearch(al, 4,new BinarySearch()));
		
		
	}

}
