package com.citi;

public class UseAccount
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account account	= new Account("Ramesh",5000);
		account.deposit(750);
		account.printStatement();
		
		// double b = account.balance; // does not happen as balance is private
		// the way around this is...
		// use a method to access the private state
		
		double b = account.getBalance();

	}

}
