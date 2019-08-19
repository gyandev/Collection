package com.gyan.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("gyan", 7);
		lm.put("gaurav", 8);
		lm.put("deepak", 12);
		lm.put("ravi", 9);
		System.out.println(lm);
		System.out.println(lm.put("gyan", 77));
		Set s=lm.keySet();
		System.out.println("======");
		System.out.println(s);
		Collection c=lm.values();
		System.out.println(c);
		System.out.println("======");
		Set s1=lm.entrySet();
		System.out.println(s1);
		System.out.println("====");
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println(m1.getKey() + ",," + m1.getValue());
			if(m1.getKey().equals("gaurav"))
			{
				m1.setValue(1000);
			}
			System.out.println(lm);
		}

	}

}
