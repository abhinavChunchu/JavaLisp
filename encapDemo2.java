package com.training.corejava.encapsulation2;

import com.training.corejava.encapsulation.BankAccount;

public class encapDemo2 {

	public static void main (String[] args)
	{
		BankAccount account = new BankAccount();
		account.branch = "new york";
		account.printAccount();
	}
}
