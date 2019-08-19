package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

class B3 implements Comparable
{
	int i,j;
	B3(int i,int j)
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
		return j-((B3)obj).j;
	}
	
}
public class A10 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new B3(9,5));
		al.add(new B3(3,7));
		al.add(new B3(9,6));
		al.add(new B3(2,7));
		al.add(new B3(1,8));
		al.add(new B3(4,9));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		}
	}
	


