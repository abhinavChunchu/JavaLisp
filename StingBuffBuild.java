package com.training.corejava.buffbuild;

public class StingBuffBuild {

	public static void main (String []args){
		//StringBuffer message =new StringBuffer();
		StringBuilder message = new StringBuilder();
		message.append("Welcome tp Scotland Bank");		; // AD1234
		message.append( " Your balance is 1450"); //AD1234 = both lines
		message.append("\n Thank you for banking with us"); // AD1234 = all the 3 lines
		
		System.out.println(message);
}
}
// String buffer is thread safe mutable class. even if two threads are operating on the buffer object it will automatically synchronize.

// String builder is not thread safe mutable class. Should not be used in multi threaded environment. Suitable for single threaded environment.