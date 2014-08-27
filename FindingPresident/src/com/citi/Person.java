package com.citi;

import java.util.Random;

public class Person
{
	private int		id;
	private int[]	iKnow;

	FindingCorbett	findMike	= new FindingCorbett(600);

	public Person(int identityNumber, int numberOfPeople)
	{
		this.id = identityNumber;
		for (int i = 0; i < numberOfPeople; i++)
		{
			Random rand = new Random(2);
			int io = rand.nextInt(findMike.getTotal()) % 600;
			this.iKnow[i] = io;
		}

	}
}
