package com.gyan.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(15,new MyComparator());
		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");
		System.out.println(pq);
	}

}
class MyComparator implements Comparator
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}
