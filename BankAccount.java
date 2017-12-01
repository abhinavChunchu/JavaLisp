package com.training.corejava.encapsulation;
// Access specifiers - private, public, protected & default
public class BankAccount {
	private String name;
	protected Long accountNumber;
	private Double balance;
	public String branch;
	String phone; //package level access - all classes in same package can access
	
	public void withdraw(Double amt)
	{
		balance = balance - amt;
	}
	
	public void deposit(Double amt)
	{
		balance = balance + amt;
	}
	
	public void printAccount() {
		
		System.out.println(" BankAccount [Name = " + name + " AccountNumber = " + accountNumber + "Branch = " + branch + "Phone = " + phone );
	}

	protected void setPhone(String newNumber){
		
		this.phone = newNumber;
	}
}
/** 
 * Access specifier  Class    package    Child   project
 * Public              yes     yes        yes     yes
 * protected           yes     yes        yes      no
 * Default             yes      yes        no      no
 * private             yes      no          no      no
 */
