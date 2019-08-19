package com.gyan.Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		System.out.println(pq.peek());
//		System.out.println(pq.element());
		for(int i=0;i<=10;i++)
		{
			pq.offer(i);
		}
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
