package com.training.corejava;

public class Operators {

	public static void main(String[] args)
	{
		int z = 20+30; // arithmetic
		
		int d = -z; // unary ( - is the unary )
		
		int x = 20;
	    int y = x++;
		System.out.println(x);
		
		/*
		 * x = x+1;//21
		 * int y = x; //21
		 */
		
		System.out.println(y);
		
		
		int a = 7;
		int b = 32;
		int c = --a-b++;
		System.out.println(a + " " + b);
		System.out.println(c);
		
		int p= 8;  //1000
		
		int q = 12; //1100
	    int r = p& q; //1000
	    System.out.println(p +" " + q + " "+ r );
	    
	    int score = 40;
	    
	    String result = (score >35)?"pass" : "fail"; //? true part, : fail part
	    
	    System.out.println(result);
		
	}
}
/**
*  Value1 Value2    &&     ||
*    T      T        T      T
*    T      F        F      T
*    F      T        F      T
*    F      F        F      T

*/