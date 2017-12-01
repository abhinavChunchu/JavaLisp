package com.training.corejava.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.*;

public class ExceptionHandling {
	public static void main (String[] args)  {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//block where the exception might happen
		try{
		int c = divide(a,b);
		System.out.println("The result is : " + c);
		FileReader f = new FileReader("c:\\temp\\info.text");
		f.read();
		}// Catch block to handle the exception	
		catch (DivisionException e){
			
			System.err.println(e.getMessage());
		} catch (NullPointException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("Main Complete");
		}
	}
	//throws keyword is used to throw the exception back to the caller
	private static int divide(int a , int b) throws DivisionException{
		try{
		if (b==0){
			// throw keyword is used to throw the exceptions
			throw new DivisionException();
		}
		} finally{
			System.out.println("Opeation Complete");
		}
		
		
		return a / b;
		}
	
	}	
// exceptions which have to be handled compulsorily such exceptions are checked exveptions
// eg:- FileNotFoundException, SQLException, ClassNotFoundException
//Exception whose handling is optional are called unchecked exception
// NullPointerException, MathExceptions, NumberFormatException, 