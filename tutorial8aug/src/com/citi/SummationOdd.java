package com.citi;

import java.util.Scanner;

public class SummationOdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner io = new Scanner(System.in);
		int numberOf = io.nextInt();

		SummationOdd summOdd = new SummationOdd();
		int value = summOdd.sum(numberOf);
		System.out.println("The summation of first n odd numbers: " + value);
	}

	private int sum(int numberOf)
	{
		int value=1;
		int prevValue =0;
		int count = numberOf;
		while (count > 0)
		{
			value = 2*count - 1;
			value = value + prevValue;
			prevValue = value;
			count--;
		}
		return value;
	}

}
