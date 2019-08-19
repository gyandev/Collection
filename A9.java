package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

class B2 implements Comparable
{
	int i,j;
	B2(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString()
	{
		return "[" +i + "," + j + "]";
	}
	@Override
	public int compareTo(Object obj)
	{
		return i-((B2)obj).i;
	}
	
}
public class A9 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new B2(9,5));
		al.add(new B2(3,7));
		al.add(new B2(9,6));
		al.add(new B2(2,7));
		al.add(new B2(1,8));
		al.add(new B2(4,9));
		System.out.println(al);
		System.out.println("====");
		Collections.sort(al);
		System.out.println(al);
		
		
		}
	}
	


