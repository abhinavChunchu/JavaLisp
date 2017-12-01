package com.training.corejava.serialization;

import java.io.IOException;

public class TestSerializationTransient {
	public static void main (String [] args) throws IOException{
		
		User user = new User();
		
		user.setUsername("Abhinav");
		user.setPassword("Sec123");
		System.out.println(user);
		user.serialize();
		System.out.println("Complete");
		
	}
	

}
