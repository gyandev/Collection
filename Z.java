package com.gyan.Collection;

import java.util.LinkedList;
// Develop a queue by making use of LinkedList

class Queue
{
	private LinkedList list=new LinkedList();
	public void add(Object obj)
	{
		list.add(obj);
	}
	public Object processElement()
	{
		return list.removeFirst();
	}
	@Override
	public String toString()
	{
		return list.toString();
	}
}
public class Z {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add("abc");
		q.add("xyz");
		q.add("hello");
		q.add(123);
		q.add(true);
		System.out.println(q);
		Object obj=q.processElement();
		System.out.println(obj);
		System.out.println(q);
		Object obj1=q.processElement();
		System.out.println(obj1);
		System.out.println(q);
		
	}
	

}
