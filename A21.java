package com.gyan.Collection;

import java.util.HashSet;




class Test2
{
	int i,j;

	public Test2(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString()
	{
		return "[" + i + "," + j + "]" ;
	}

	@Override
	public int hashCode()
	{
		System.out.println("hashCode");
		String s1=Integer.toString(i);
		String s2=Integer.toString(j);
		int hash=s1.hashCode();
		hash+=s2.hashCode();
		return hash;
	}
@Override
public boolean equals(Object obj) {
	System.out.println("equals");
		
		return (obj instanceof Test2 && ((Test2)obj).i==i &&((Test2)obj).j==j );
	}
	
}

public class A21 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(new Test2(1,2));
		System.out.println("============");
		set.add(new Test2(1,2));
		System.out.println(set);
		System.out.println("size="+set.size());
		System.out.println("============");
		set.add(new Test2(2,2));
		System.out.println(set);
		System.out.println("==========");
		set.add(new Test2(2,2));
		System.out.println("size:"+set.size());
		System.out.println("=========");
		set.add(new Test2(2,1));
		System.out.println("size:" +set.size());
		System.out.println(set);
		System.out.println("====");
		set.add(new Test2(2,2));
		System.out.println("size:"+set.size());
		System.out.println(set);
		System.out.println("====");
		set.add(new Test2(1,2));
		System.out.println(set);
		System.out.println("size:" +set.size());
		System.out.println("===");
		set.add(new Test2(1,2));
		System.out.println(set);
		System.out.println("size:" +set.size());
		System.out.println("===");
		set.add(new Test2(0,3));
		System.out.println(set);
		System.out.println("size:" +set.size());
		System.out.println("===");
		set.add(new Test2(1,2));
		System.out.println(set);
		System.out.println("size:" +set.size());
		System.out.println("===");

}
}
