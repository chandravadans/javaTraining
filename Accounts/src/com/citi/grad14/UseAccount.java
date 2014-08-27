package com.citi.grad14;

public class UseAccount
{

	public static void main(String[] args)
	{
		
		Account account = new Account("Ramesh", 500);
		account.deposit(500);
		account.printStatement();
		

	}

}
