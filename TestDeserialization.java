package com.training.corejava.serialization;

import java.io.IOException;

public class TestDeserialization {
	
	public static void main (String[] args) throws ClassNotFoundException, IOException{
		
		User user = new User();
		User deserializationObject = user.deserialize();
		System.out.println(deserializationObject);
		
	}

}
