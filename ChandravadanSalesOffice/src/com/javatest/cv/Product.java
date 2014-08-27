package com.javatest.cv;

public class Product
{
	private String name;
	private Double cost;
	private Integer numberInStock;

	/**
	 * Constructs a new product
	 * @param theName Name of the product
	 * @param theCost Cost of the product
	 * @param theNumberInStock Number left in stock
	 */
	public Product(String theName, Double theCost, Integer theNumberInStock)
	{
		name=theName;
		cost=theCost;
		numberInStock=theNumberInStock;

	}

	/**
	 * Gets the name of the employee
	 * @return String, the name of the employee
	 */
	public String getName(){
		return name;
	}
	
	
	/**
	 * Gets the cost of the product
	 * @return Double, the cost of the product
	 */
	public Double getCost(){
		return cost;
	}
	
	/**
	 * Gets the number of these items in inventory
	 * @return The number of items of these type in the inventory
	 */
	public Integer getNumberInStock(){
		return numberInStock;
	}
	
	/**
	 * Sets the number of items in the inventory
	 * @param theNewStock The new number of items in the inventory
	 */
	public void setNumberInStock(Integer theNewStock){
		numberInStock=theNewStock;
	}

	/**
	 * Generate a String representation of the Product
	 */
	@Override
	public String toString(){
		return (name+". costs "+cost+". ("+numberInStock+" available)");
	}

}
