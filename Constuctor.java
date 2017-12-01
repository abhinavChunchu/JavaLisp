package com.training.corejava.Constr;
// 1. default constructor added when only none exist
// 2. simple constructor with no parameters or arguements
// 3. parameterized constructor with parameters
// 4. Copy constructors - With same type of object as a parameter.

import java.lang.reflect.Constructor;

public class Constuctor {

	private int a;
	private String b;
	
	public String toString()
	{
		return "Constructor {[ a = " + a  + ", b= " + b + "]";
	}
	// simple
	public  Constructor(){
		
		a =0;
		b = "f";
	}
	
	// parameterized
	public void Constructor (int a){
		
		this.a =a;
		this.b = "e";
	
		
		
	}
	
	// parameterized
	public  Constructor (int a, String b){
		
		this.a = a;
		this.b = "b";
	}
	
	//  copy
	public  Constructor(Constuctor original){
		
		this.a = original.a;
		this.b = original.b;
	}
	
	
}
