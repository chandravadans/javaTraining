package com.javatest.cv;

import java.util.Scanner;

public class MainDriver
{
	/**
	 * Entry point for the system
	 * @param args
	 */
	public static void main(String[] args)
	{
		SalesOffice salesOffice = new SalesOffice();

		// Add some employees
		salesOffice.addEmployee(new Employee("Ramesh", "Manager", 50000.0));
		salesOffice.addEmployee(new Employee("Dinesh", "Security", 5000.0));
		salesOffice.addEmployee(new Employee("Suresh", "Developer", 23000.0));
		salesOffice.addEmployee(new Employee("Mitesh", "Manager", 59000.0));
		salesOffice.addEmployee(new Employee("Rakesh", "Caterer", 5000.0));

		salesOffice.addEmployee(new SalesPerson("Vijay", "PC sales", 50000.0, 10.0));
		salesOffice.addEmployee(new SalesPerson("Vinod", "Electrical", 4000.0, 8.0));
		salesOffice.addEmployee(new SalesPerson("Ram", "Books", 50000.0, 12.0));
		salesOffice.addEmployee(new SalesPerson("RandomGuy1", "Gadgets", 5000.0, 11.0));
		salesOffice.addEmployee(new SalesPerson("RandomGuy2", "Misc", 500001.0, 13.0));

		

		salesOffice.addProduct(new Product("PC", 10.0, 58));
		salesOffice.addProduct(new Product("Laptop", 15.0, 73));
		salesOffice.addProduct(new Product("Mouse", 5.0, 57));
		salesOffice.addProduct(new Product("Keyboard", 5.0, 15));

		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter a choice:");
			System.out.println("\t1: list employees");
			System.out.println("\t2: find an employee by name");
			System.out.println("\t3: fire an employee");
			System.out.println("\t4: list products");
			System.out.println("\t5: sell a product");
			System.out.println("\t6: View most valuable sales man");
			
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Employees: -----------");
				salesOffice.listEmployees();
				break;
			case 2:
				System.out.print("Enter the name: ");
				String name = scanner.next();
				Employee e = salesOffice.findEmployee(name);
				if (e != null)
					System.out.println(e);
				else
					System.out.println("We have no " + name);
				break;
			case 3:
				System.out.print("Enter the name: ");
				name = scanner.next();					
				if (salesOffice.fireEmployee(name))
					System.out.println("Bye bye " + name);
				else
					System.out.println("Sorry, no " + name  + " here");

				break;
			case 4:
				System.out.println("Products: -----------");
				salesOffice.listProducts();
				break;
			case 5:
					System.out.println("Enter product name: ");
					name = scanner.next();
					System.out.println("Enter quantity: ");
					int quantity = scanner.nextInt();
					if (salesOffice.sellThroughSalesman(name, quantity))
						System.out.println("Thanks for your purchase");
					else
						System.out.println("Sorry insufficient stock"); 
				
				break;
				
			case 6:
				String mostValuableSalesman=salesOffice.getMostValuableSalesman();
				System.out.println("The most valuable salesman for the store is : "+mostValuableSalesman);
							
			}
		} while (choice != 0);
		System.out.println("Thank you");
		scanner.close();
	}
}
