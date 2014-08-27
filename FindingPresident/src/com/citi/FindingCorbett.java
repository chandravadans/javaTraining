package com.citi;

import java.util.Random;

public class FindingCorbett
{
	private static int	TOTAL_PEOPLE	= 600;

	public static void main(String[] args)
	{
		Person[] employee = new Person[TOTAL_PEOPLE];
		// TODO Auto-generated method stub
		for (int j = 0; j < TOTAL_PEOPLE; j++)
		{
			Random rand = new Random(2);
			int numberOfPeople = rand.nextInt(TOTAL_PEOPLE);

			employee[j] = new Person(j, numberOfPeople);
		}

	}

	public FindingCorbett(int people)
	{
		int TOTAL_PEOPLE = people;
	}

	int getTotal()
	{
		return TOTAL_PEOPLE;
	}

}
