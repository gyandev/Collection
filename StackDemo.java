package com.gyan.Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
	//	System.out.println(((Object) s).offset("A"));
		System.out.println(s.search("A"));
		System.out.println(s.indexOf("A"));
		System.out.println(s.search("z"));
	
		
	}

}

