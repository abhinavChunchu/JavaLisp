package com.training.corejava.firstprogram;
//package declaration (first line of any java class is pckage declaration)

//impost statements( to import classes outside the package.Can import any number of classes)

import java.util.Date;

//class declaration ( class name must match the filename. Such class must be public)
public class Additionn {

	
	//data members
	static String prefixMessage = " THE RESULT IS : ";
	
	// main method ( public because accessible to the jvm, void means doesnt return any thing
	// args are the arguement passes to the program while execution
	public static void main (String[] args)
	{
	
		//variable declaration (local variables)
		//<datatype> <name> = <default value>;
		Integer firstValue = Integer.parseInt(args[0]);
		Integer SecondValue = Integer.parseInt(args[1]);
		
		Integer result = firstValue + SecondValue;
		
		System.out.println("The operation was done at : " + new Date());
		System.out.println(prefixMessage + result);
		

		
		
	}
}
