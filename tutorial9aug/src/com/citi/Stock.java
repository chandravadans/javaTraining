package com.citi;

public class Stock
{

	private String	company;
	private int	price;
	private int		quantity;

	String getCompany()
	{
		return company;
	}

	int getPrice()
	{
		return price;
	}

	int getQuantity()
	{
		return quantity;
	}

	Stock(String com, int pri, int qua)
	{
		this.company = com;
		this.price = pri;
		this.quantity = qua;
	}

	void printStockDetails()
	{
		System.out.println("Company: " + company);
		System.out.println("Spot Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
}
