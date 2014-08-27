package com.citi;

public class Account
{
	private String	owner;		// INSTANCE VARIABLE
	private double	balance;	// THEY GET INITIALIZED BOOLEAN=FALSE;
								// OBJECT=NULL; DOUBLE=0;

	void deposit(double amount)
	{
		balance += amount;
		//what this translates to is
		// this.balance += amount;
	}

	void withdraw(double amount)
	{
		balance -= amount;
	}
	
	double getBalance()
	{
		double value = balance;
		return value;
	}

	void printStatement()
	{
		System.out.println(owner + "has" + balance);
	}

	Account(String o, double amount)
	{
		owner = o;
		balance = amount;
	}
}
