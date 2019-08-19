package com.gyan.Collection;

import java.util.LinkedList;

// Develop a stack making use of LinkedList
class Stack
{
	private LinkedList list=new LinkedList();
	public void add(Object obj)
	{
		list.add(obj);
	}
	public Object processElement()
	{
		return list.removeLast();
	}
	@Override
	public String toString()
	{
		return list.toString();
	}
	
}
public class Y {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("abc");
		s.add("xyz");
		s.add("hello");
		s.add(123);
		s.add(true);
		System.out.println(s);
		Object obj=s.processElement();
		System.out.println(obj);
		System.out.println(s);
		Object obj1=s.processElement();
		System.out.println(obj1);
		System.out.println(s);

}
}
