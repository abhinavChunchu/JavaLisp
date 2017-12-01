package com.training.corejava.polymrphc;


/**
 * 
 * @author abhin
 *  method overloading
 * 
 * 1.number of parameters must change
 * 2. type of parameters must change
 * 3. order of parameters must change
 *
 */

public class MethodOvrldng {
	
	public int add ( int a, int b) {
		
		return a + b;
		
	}
	// thre different parameters
	public int add ( int a, int b , int c) {
		
		return a + b + c;
		
	}
	// float
	public float add ( float a, float b) {
	
	return a + b;
	}
	

     // one 1 float 1 int
	public float add ( float a, int b) {
	
	  return a + b;
	
}

    public float add ( int a, float b) {
	
	return a + b;
	
}
    
  public static void main (String [] args)
  {
	  MethodOvrldng mo = new  MethodOvrldng();
	  mo.add(10, 29);
	  mo.add(10f, 29);
	  mo.add(10, 20, 30);
	  
  }
}
