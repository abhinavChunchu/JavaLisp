package com.training.corejava.intrf;

public interface RemoteControl {
	
	// all data members are public, static, final
	 String key = "1234"; // by default they are public , static, final
	 
	 // all methods are abstract and public
	 void changeVolume(); // by default public , abstract
	 
	 // no concrete methods
	 
	 void changeChannel();

}
