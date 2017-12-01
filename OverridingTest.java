package com.training.corejava.polymrphc;

public class OverridingTest {
	
	public static void main (String [] args)
	{
		Parent a = new Parent();
		a.printMyName();
		a = new Child();
		a.printMyName();
	}

}
