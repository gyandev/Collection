package com.gyan.Collection;

import java.util.Comparator;
import java.util.TreeSet;

class L3
{
	int i,j;
	L3(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString()
	{
		return "[" + i + "," + j + "]" ;
	}
	static class L1 implements Comparator
	{
		@Override
		public int compare(Object obj1,Object obj2 )
		{
			L3 o1=(L3)obj1;
			L3 o2=(L3)obj2;
			return o1.i-o2.i;
			
		}
	}
	static class L2 implements Comparator
	{
		@Override
		public int compare(Object obj1,Object obj2 )
		{
			L3 o1=(L3)obj1;
			L3 o2=(L3)obj2;
			return o1.j-o2.j;
			
		}
	}
	
}
public class A25 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet(new L3.L1());
		TreeSet t2=new TreeSet(new L3.L2());
		t1.add(new L3(10,20));
		t1.add(new L3(20,30));
		t1.add(new L3(40,200));
		t1.add(new L3(22,45));
		System.out.println("L3 sort based on i");
		System.out.println(t1);
		t2.add(new L3(1,2));
		t2.add(new L3(3,9));
		t2.add(new L3(4,5));
		t2.add(new L3(6,6));
		System.out.println("====");
		System.out.println("L3 sort based on J");
		System.out.println(t2);
		
	}

}
