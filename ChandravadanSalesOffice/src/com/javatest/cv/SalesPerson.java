package com.javatest.cv;

public class SalesPerson extends Employee
{

	private Double flatPercent;
	
	/**
	 * Constructs a salesperson
	 * @param theName Name of the salesperson
	 * @param theTitle Title of the salesperson
	 * @param theSalary Salary of the salesperson
	 * @param theFlatPercent Bonus of the salesperson
	 */
	public SalesPerson(String theName, String theTitle, double theSalary, Double theFlatPercent)
	{
		super(theName, theTitle, theSalary);
		flatPercent=theFlatPercent;
		SalesOffice.salesMen.add(theName);
		
	}
	
	/**
	 * Textual representation of a salesperson
	 */
	@Override
	public String toString()
	{
		StringBuilder result=new StringBuilder(super.toString());
		result.append(" (A SalesPerson with "+flatPercent+" % flat Percent.)");
		return result.toString();
	}

}
