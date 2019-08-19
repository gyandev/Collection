package com.gyan.Collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("gyan", 7);
		m.put("gaurav", 8);
		m.put("deepak", 12);
		m.put("gyan", 9);
		System.out.println(m);
		/*System.out.println(m.put("gyan", 77));
		Set s=m.keySet();
		System.out.println("======");
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		System.out.println("======");
		Set s1=m.entrySet();
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
			System.out.println(m);
		}
*/
	}

}
