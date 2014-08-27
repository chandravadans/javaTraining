package com.javatest.cv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SalesOffice
{
	private Map<String,Employee> employees;
	private Map<String,Product> products;
	private Map<String, Double> salesByPrice;
	private Map<String, Double> salesByVolume;
	public static List<String> salesMen;
	int nextSalesman=0;


	
	/**
	 * Constructs a new Sales Office
	 */
	public SalesOffice(){
		employees=new HashMap<String,Employee>();
		products=new HashMap<String,Product>();
		salesByPrice=new TreeMap<String, Double>();
		salesMen=new ArrayList<String>();
	}
	
	
	public String getMostValuableSalesman(){
		Double maxSale=0.0;
		String theMostValuable=null;
		for(String theSalesGuy: salesByPrice.keySet()){
			if(salesByPrice.get(theSalesGuy)>maxSale){
				maxSale=salesByPrice.get(theSalesGuy);
				theMostValuable=theSalesGuy;
			}
		}
		return theMostValuable+" who made "+maxSale+ "$ of sales";
	}
	

	/**
	 * Adds an employee to the roll
	 * @param theEmployee Employee object to be added
	 * @return true if the employee is added, false if the employee already exists
	 */
	public boolean addEmployee(Employee theEmployee){

		String theName=theEmployee.getName();
		if(employees.containsKey(theName)){
			return false;
		}
		else{

			employees.put(theName, theEmployee);
			
			if(isSalesman(theName)){
				salesMen.add(theName);
			}
			return true;
		}
		
	}

	/**
	 * List all the employees on the roll
	 */
	public void listEmployees(){
		for(Employee thisEmployee: employees.values())
			System.out.println(thisEmployee.toString());
	}


	/**
	 * Finds an employee on the roll
	 * @param theName Name of the employee to search
	 * @return null if the employee wasn't found, the object if the Employee is found
	 */
	public Employee findEmployee(String theName){
		if(!employees.containsKey(theName))
			return null;
		else
			return (employees.get(theName));
	}

	/**
	 * Fire an employee from the roll
	 * @param theName Name of the employee to  be fired
	 * @return true if the employee was fired, false if the employee wasn't found
	 */
	public boolean fireEmployee(String theName){
		if(!employees.containsKey(theName))
			return false;
		else{
			employees.remove(theName);
			if(isSalesman(theName))
				salesMen.remove(theName);
			return true;
		}
	}

	/**
	 * Adds a product to the inventory
	 * @param theProduct The Product object to be added
	 * @return true if the object was added, false otherwise
	 */
	public boolean addProduct(Product theProduct){

		if(products.containsKey(theProduct.getName()))
			return false;
		else{
			products.put(theProduct.getName(), theProduct);
			return true;
		}
	}

	/**
	 * Lists the products in the inventory
	 */
	public void listProducts(){
		for(Product thisProduct: products.values())
			System.out.println(thisProduct.toString());
	}


	/**
	 * Sell an item to the customer
	 * @param theName Name of the item to be sold
	 * @param quantity Quantity of the item to be sold
	 * @return true if sale succeeds, false if it fails
	 */
	public boolean sell(String theName, Integer quantity){
		if(!products.containsKey(theName))
			return false;
		else{
			Product theProduct=products.get(theName);
			int numberOfTheseLeft=theProduct.getNumberInStock();
			if(numberOfTheseLeft<quantity)
				return false;
			else{
				theProduct.setNumberInStock(numberOfTheseLeft-quantity);
				products.put(theName, theProduct);
				return true;
			}
		}
	}

	/**
	 * Sell an item to the customer through a salesman
	 * @param theName Name of the item to be sold
	 * @param quantity Quantity of the item to be sold
	 * @return true if sale succeeds, false if it fails
	 */
	public boolean sellThroughSalesman(String theName, Integer quantity){
		if(!products.containsKey(theName))
			return false;
		else{
			String theSalesGuy=salesMen.get(nextSalesman);
			nextSalesman++;
			nextSalesman=nextSalesman%(salesMen.size());
			
			Product theProduct=products.get(theName);
			int numberOfTheseLeft=theProduct.getNumberInStock();
			if(numberOfTheseLeft<quantity)
				return false;
			else{
				
				//update the Product object with the new quantity
				theProduct.setNumberInStock(numberOfTheseLeft-quantity);
				
				//update the inventory of the product
				products.put(theName, theProduct);
				
				//Update the sales records of theSalesGuy
				if(salesByPrice.containsKey(theSalesGuy)){
					Double valueSoldAlready=salesByPrice.get(theSalesGuy);
					salesByPrice.put(theSalesGuy, valueSoldAlready+(theProduct.getCost()*quantity));
				}
				else
					salesByPrice.put(theSalesGuy, (theProduct.getCost()*quantity));

				return true;
			}
		}
	}

	/**
	 * Validates if an employee is a salesman or not
	 * @param theName Name of the employee
	 * @return true if the employee's a salesman, false if not
	 */
	public boolean isSalesman(String theName){
		if(!employees.containsKey(theName)){
			//System.out.println("Sorry, "+theName+" doesn't work here.");
			return false;
		}
		else{
			if(!(employees.get(theName).getClass().getName()).equalsIgnoreCase("SalesPerson")){
				//System.out.println("Sorry, "+theName+" isn't a salesman here");
				return false;
			}
			else
				return true;
		}
	}
	
	// Methods to find the most valuable salesmen by volume and price, --IN VERSION 2--
}