package com.citi;

public class LifeStage
{

	public static void main(String[] args)
	{
		System.out.println("Enter your age HUMAN: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double age= input.nextDouble();
		
		LifeStage ager = new LifeStage();
		
		String value = ager.uBelong(age);
		System.out.println("U belong to the age group of: "+value);
	}
	
	private String uBelong(double age)
	{
		if(age<0)
			return "embryo";
		else if (age < 1)
			return "INFANT";
		else if (age < 10)
			return "child";
		else if (age < 19)
			return "Teenager";
		else
			return "Adult";
	}

}
