package com.training.corejava.encapsulation;

public class EncapDemo {
	public static void main (String[] args)
	{
		BankAccount account = new BankAccount();
		account.branch = "new jersey";
		// account.branch is = 500.00; - private data cannot be accessed
	}

}
