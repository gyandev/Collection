package com.gyan.Collection;

import java.util.ArrayList;


class T1
{
	int i;
	T1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		return Integer.toString(i);
		
	}
	
}
public class T {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add(90);
		al.add(new T1(100));
		al.add(new T1(200));
		System.out.println(al);
	}

}
