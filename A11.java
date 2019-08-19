package com.gyan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class A11 implements Comparator
{
	A11()
	{
		
	}
	int i,j;
	A11(int i,int j)
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
	public int compare(Object obj1,Object obj2 )
	{
		A11 a11=(A11)obj1;
		A11 b11=(A11)obj2;
		return a11.i-b11.i;
	}
	


	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new A11(9,5));
		al.add(new A11(3,7));
		al.add(new A11(9,6));
		al.add(new A11(2,7));
		al.add(new A11(1,8));
		al.add(new A11(4,9));
		System.out.println(al);
		Collections.sort(al,new A11());
		System.out.println(al);
		
		
		}
	}
	


