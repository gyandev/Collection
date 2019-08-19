package com.gyan.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCust implements Comparator{


	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2)
		{
			return +1;
		}
		else if(I1>I2)
		{
			return -1;
		}
		else
		return 0;
	}
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new TreeSetCust());
		ts.add(43);
		ts.add(32);
		ts.add(21);
		ts.add(12);
		ts.add(9);
		ts.add(54);
		ts.add(4);
		System.out.println(ts);
	}

}
