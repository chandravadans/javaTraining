package com.javatest.cv;

public class Employee
{
	private String name;
	private String title;
	private Double salary;
	
	/**
	 * Constructor for Employee
	 * @param theName 
	 * 	Name of the employee 
	 * @param theTitle
	 * 	Title of the employee
	 * @param theSalary
	 * 	Salary of the employee
	 */
	public Employee(String theName, String theTitle, Double theSalary)
	{
		name=theName;
		title=theTitle;
		salary=theSalary;
	}
	
	/**
	 * Gets the name of the employee
	 * @return String The employee name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * To String method to print out the employee as a string
	 */
	@Override
	public String toString()
	{
		return (name+" , "+title+" with a salary of "+salary);
	}
	

}
