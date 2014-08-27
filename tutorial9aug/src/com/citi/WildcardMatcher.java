package com.citi;

import java.util.Scanner;

public class WildcardMatcher
{
	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		String regx = io.next();
		String input = io.next();

		// char[] inputArray = input.toCharArray();
		int starPosition = getStarPosition(regx);
		
		ifMatch(regx, input, starPosition);

	}

	int getStarPosition(String regx)
	{
		char[] regxArray = regx.toCharArray();
		int starPosition = -1;

		for (char letter : regxArray)
		{
			starPosition++;
			if (letter == '*')
				break;
		}
		return starPosition;
	}

	void ifMatch(String regx, String input, int starPosition)
	{
		String regxBeforeStar = regx.substring(0, starPosition);
		String regxAfterStar = regx.substring(starPosition + 1, regx.length());

		String inputBeforeStar = input.substring(0, starPosition);
		String inputAfterStar = input.substring(
				input.length() - regxAfterStar.length(), input.length());

		if ((inputBeforeStar.equals(regxBeforeStar))
				&& (inputAfterStar.equals(regxAfterStar)))
		{
			System.out.println("Strings: " + regx + " and " + input
					+ " match: " + starPosition);
		} else
		{
			System.out.println("No match found: " + starPosition);
		}
		System.out.println(regxBeforeStar + regxAfterStar + "\t"
				+ inputBeforeStar + inputAfterStar);
	}
}
