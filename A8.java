package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;

class B1 implements Comparable
{
	int i;
	B1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		return "i=" +i;
	}
	@Override
	public int compareTo(Object obj)
	{
		return i-((B1)obj).i;
	}
	
}
public class A8 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new B1(10));
		al.add(new B1(100));
		al.add(new B1(200));
		al.add(new B1(99));
		al.add(new B1(77));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		}
	}
	


