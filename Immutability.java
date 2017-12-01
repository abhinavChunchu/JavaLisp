package com.training.corejava.buffbuild;

public class Immutability {

	public static void main (String []args){
		String message = "Welcome tp Scotland Bank"; // AD1234
		
		message = message  + " Your balance is 1450"; //AD4567 = both lines
		message = message + " \n Thank you for banking with us"; // AD5678 = all the 3 lines
		
		String name1 = "Abhinav"; // Ad68959 = "Abhinav "
		String name2 = "Abhinav"; // Ad68959 = "Abhinav"
		
		int i1 = 100; // AD111 =`100
		int i2 = 100; // ADE222 = 100
		
		System.out.println(message);
	}
}
