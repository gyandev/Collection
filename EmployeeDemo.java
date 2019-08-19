package com.gyan.Collection;
import java.util.*;

class Employee1 implements Comparator<Employee1>, Comparable<Employee1>{
	   private String empName;
	   private int empAge;
	  
	   Employee1(){
	   }
	 
	   Employee1(String name, int age){
	      empName = name;
	      empAge = age;
	   }
	   @Override
	public String toString()
	   {
		   return "[" + empName + ","+empAge +"]" ;
	   }
	 
	   public String getEmpName(){
	      return empName;
	   }
	 
	   public int getEmpAge(){
	      return empAge;
	   }
	 
	   // Overriding the compareTo method to sort based on Name
	   @Override
	public int compareTo(Employee1 e){
	      return (this.empName).compareTo(e.empName);
	   }
	 
	   // Overriding the compare method to sort the age
	   @Override
	public int compare(Employee1 e1, Employee1 e2){
	      return e1.empAge - e2.empAge;
	   }
	   
	}


public class EmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1("gyan",30));
		list.add(new Employee1("dev",43));
		list.add(new Employee1("pandey",41));
		list.add(new Employee1("sonu",10));
		list.add(new Employee1("bumar",40));
		list.add(new Employee1("jingh",80));
		list.add(new Employee1("kumit",33));
		System.out.println("Sorting based on empNames-Comparable");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new Employee1());
		System.out.println("Sorting based on empAge-Comparator");
		System.out.println(list);
		
	}

}
