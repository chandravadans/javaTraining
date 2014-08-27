package com.citi;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {

		int i,j = 10;

		i = (int) j;

		// TODO Auto-generated method stub
		System.out.println("Hello Bandhu: HO" + "w u doing?"+"\nwhats the radius?");

//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		Scanner ans = new Scanner(System.in);
		double radius = ans.nextDouble();
		HelloJava areaCircle= new HelloJava();
		double area = areaCircle.calcArea(radius);
//		char letterNo2 = response.charAt(2);
		System.out.println("Your radius was: " + radius + "\t whose area is: " + area);
	}
	
	public double calcArea(double radius)
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}
