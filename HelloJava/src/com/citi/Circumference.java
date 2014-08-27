package com.citi;

public class Circumference {

	public static void main(String[] args)
	{
		System.out.println("If you want the circumference give me the radius: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double radius = input.nextDouble();
		
		Circumference circleCircum = new Circumference();
		double value = circleCircum.calcCircum(radius);
		System.out.println("value of circumference is:  "+value);
	}

	public double calcCircum(double radius)
	{
		double value = 2* Math.PI * radius;
		return value;
	}
}
