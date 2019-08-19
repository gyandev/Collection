package com.gyan.Collection;

import java.util.TreeSet;
/*class MyComaparator implements Comparator
{

	public int compare(Object obj1, Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2)
		{
			return +1;
		}
		else if(I1>I2)
		{
			return -1;
		}
		else 
			return 0;
		
		

	}
	
}*/
public class TreeSetDemo {
	public static void main(String[] args) {
		
			TreeSet t=new TreeSet();
//			t.add(null);
			t.add("A");
			t.add("B");
			t.add("D");
			t.add("C");
			t.add("a");
			t.add("Z");
	//		t.add("1");
			System.out.println(t);
	//	t.add(new Integer(10));
		//	t.add(null);
			System.out.println(t);
			
		}
	

		
		
	}




