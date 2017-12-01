package com.training.corejava.clone;

public class TestCloning {
	
	public static void main (String[] args) throws CloneNotSupportedException{
	Person p1 = new Person();
	p1.setAge(26);
	p1.setCity("Iselin");
	p1.setName("Abhinav");
	p1.setHeight(5.9f);
	p1.setPhone("6098657884");
	
	
	
	Person p2 = p1.clone(); // Creating a copy
	
	
	
	Person p3 = p1; // create a reference to the same copy
	p2.setName("kavya");
	p3.setName("Amulya");
	
	System.out.println(p1);
	
	System.out.println(p2);

	System.out.println(p3);
	}
	
}