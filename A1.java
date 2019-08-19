package com.gyan.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class A1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
//		v.addElement('A');
		System.out.println(v);
		System.out.println("===");
		Enumeration e=v.elements();
//		v.addElement(11);
		while(e.hasMoreElements())
		{
			Integer I=(Integer) e.nextElement();
			System.out.println(I);
			
			/*if(I%2==0)
			{
				System.out.println(I);
			}*/
		}
	}

}
