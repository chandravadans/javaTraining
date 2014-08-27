package com.citi;

public class PrintDaysMonthSwitch
{

	public static void main(String[] args)
	{

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Welcome TimeTraveller:\n Enter the month name or number to know thenumber of days: ");
		int monthName = input.nextInt();
		int currentYear = input.nextInt();

		PrintDaysMonthSwitch printDays = new PrintDaysMonthSwitch();

		int daysInMonth = printDays.daysAre(monthName, currentYear);
		System.out.println("Number of days are: " + daysInMonth);

	}

	private int daysAre(int monthName, int currentYear)
	{

		switch (monthName)
		{
		case 1:
		{
			return 31;
		}

		case 2:
		{
			if ((currentYear % 4 == 0) && (currentYear % 100 != 0))
				return 29;
			else
				return 28;
		}

		default:
		{
			System.out.println("On Earth there are just 12 months");
			return 0;
		}
		}

	}
}
