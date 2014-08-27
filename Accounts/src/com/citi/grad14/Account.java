package com.citi.grad14;

public class Account
{
	private String name;
	private double balance;

	public Account (String n, double b)
	{
		name = n;
		balance = b;
	}

	public void deposit(double amount)
	{
		balance+=amount;
	}


	public void withdraw(double amount)
	{
		balance += amount;
	}

	public void printStatement()
	{
		System.out.println(name + " has " + balance);
	}
}
