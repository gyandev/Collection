package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class B5
{
	int i,j;
	B5(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString()
	{
		return "[" + i + "," + j + "]";
	}
}
class B6 implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		B5 b5=(B5)obj1;
		B5 c5=(B5)obj2;
		return b5.i-c5.i;
		
				
	}
}
class B7 implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		B5 b5=(B5)obj1;
		B5 c5=(B5)obj2;
		return (b5.j-c5.j);
		
				
	}
}
public class A12 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new B5(9,5));
		al.add(new B5(3,7));
	//	al.add(new B5(9,6));
		al.add(new B5(2,7));
		al.add(new B5(1,8));
		al.add(new B5(4,9));
		System.out.println(al);
		System.out.println("=====");
		Collections.sort(al,new B6());
		System.out.println(al);
		System.out.println("====");
		Collections.sort(al,new B7());
		System.out.println(al);
		
	}

}
