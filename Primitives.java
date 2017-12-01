package com.training.corejava;

public class Primitives {

	public static void main (String [] args)
	
	{
		
		boolean var1 = true; // false
		
		char var2 = 'a'; // any single character ( aplhabet, digit, one special char ) Character
		
		byte var3 = 127; // ranges from -128 to 127 or any single char) Byte
		
		short var4 = 134; // ranges -327689 to 327689  Short
		
		int var5 = 864856; // 4 bytes ( Integer)
		
		long var6 = 123445566677L; // ( size - 8bytes) Long
		
		float var7 = 760.25f; //(size -8byte) Float
		
		double var8 = 8765893434354.234; // size - 10bytes) Double
		
		// explicit is casting from parent/ bigger type to child/ smaller type
		byte var9 = (byte) var4; // ( cannot convert from bigg3er data type to smaller data type)
		
	       System.out.println(var9);
		
		long age =55;
		
		byte castedAge = (byte) age;
		
		System.out.println(castedAge);
		
		// implicit casting - csting from smaller or child type to parent/ bigger type
		
		long var10 = var4;
		// in implicit no need to do type casting it java type casts by default
		
		//boxing and unboxing
		// boxing is converting a primitive type to wrapper class.
		Long ageObj = age; // (boxing / automatic)
		
	    printobject(ageObj);
	    
	    //unboxing is converting an object ( wrapper class object ) to primitive
		 
	    long ageLong =ageObj.longValue();

		
	}
	
	public static void printobject(Object o)
	{
		System.out.println(o);
		
	}
}
