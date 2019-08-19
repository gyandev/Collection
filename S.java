package com.gyan.Collection;

import java.util.ArrayList;

class S1 {
	int i;
	S1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		
		return "i="+ i;
	}

}
public class S
{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add(90);
		al.add(new S1(100));
		al.add(new S1(200));
		System.out.println(al);
	}
}

