package com.citi;

public class Vehicle
{

	private String	medium;
	private String	mode;
	private double	topSpeed;
	private double	mileage;
	private int		capacity;

	public String getMedium()
	{
		return medium;
	}

	public String getMode()
	{
		return mode;
	}

	public double getTopSpeed()
	{
		return topSpeed;
	}

	public double getMileage()
	{
		return mileage;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public Vehicle(String medium, String mode, double topSpeed, double mileage,
			int capacity)
	{
		this.medium = medium;
		this.mode = mode;
		this.topSpeed = topSpeed;
		this.mileage = mileage;
		this.capacity = capacity;
	}

}
