package student.collectionsgenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class UsingCollections {

	public static void main(String[] args) {

		// Work with a list of Strings.
		manageFootballTeams();

		// Work with a LinkedList of Doubles.
		// manageSalaries();

		// Work with a TreeMap of Employees.
		// manageEmployees();
	}


	// Work with a list of Strings.
	public static void manageFootballTeams() {

		// TODO: Declare a list to hold football teams (i.e. Strings).
		//       You can create either an ArrayList or a LinkedList.
		ArrayList<String> footballTeams = new ArrayList<String>();


		// Miscellaneous helper variables.
		String team;
		int index;

		// Display menu options in a loop.
		int option = -1;
		do {

			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a list of football teams (Strings)"  );
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Append team");
				System.out.println("2. Add team at index");
				System.out.println("3. Set team at index");
				System.out.println("4. Remove team at index");
				System.out.println("5. Remove specified team");
				System.out.println("6. List all teams");
				System.out.println("7. Quit");

				option = Helper.getInt("\nEnter option => ");

				switch (option) {

				case 1:
					team = Helper.getString("Enter team: ");
					// TODO: Append team to list, and display success/failure message.
					//       Display a success/failure message.

					footballTeams.add(team);
					break;

				case 2:
					team  = Helper.getString("Enter team: ");
					index = Helper.getInt("Enter index: ");
					// TODO: If index is within range, add team at specified index in list.
					//       Note, you ARE allowed to add an item at one-beyond-the-end of the list (similar effect to appending). 
					//       Display a success/failure message.
					if(index>=0 && index < footballTeams.size() )
					{
						footballTeams.add(index, team);

					}
					else if (footballTeams.size() == index)
						footballTeams.add(index, team);

					break;

				case 3:
					team  = Helper.getString("Enter team: ");
					index = Helper.getInt("Enter index: ");
					// TODO: If index is within range, set team at specified index in list.
					//       Display a success/failure message.
					if(index>=0 && index < footballTeams.size() )
					{
						footballTeams.set(index, team);

					}
					else
						System.out.println("Can't add team at index!");
					break;

				case 4:
					index = Helper.getInt("Enter index: ");
					// TODO: If index is within range, remove team at specified index in list.
					//       Display a success/failure message.
					if(index >=0 && index<footballTeams.size())
						footballTeams.remove(index);
					else
						System.out.println("Invalid index!");

					break;

				case 5:
					team = Helper.getString("Enter team: ");
					// TODO: Remove team from list.
					//       Display a success/failure message.
					if(!footballTeams.remove(team))
						System.out.println("The team doesn't exist! Whats dead cant be killed! :P");
					else
						System.out.println("Done. "+team+" doesn't exist anymore!");

					break;

				case 6:
					// TODO: Display all items in list.
					Helper.displayCollection(footballTeams);
					/*for(String footballTeam:footballTeams)
						System.out.println(footballTeam);*/
					break;

				case 7:
					// This is a valid option, but there's nothing to do here.
					System.out.println("zzz!");
					break;

				default:
					System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}

		} while (option != 7);
	}


	// Work with a LinkedList of Doubles.
	public static void manageSalaries() {

		// TODO: Declare a LinkedList to hold salaries (i.e. Doubles).
		LinkedList<Double> salariesList = new LinkedList<Double>();


		// Miscellaneous helper variables.
		double salary;

		// Display menu options in a loop.
		int option = -1;
		do {

			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a LinkedList of salaries (Doubles)  ");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Push salary");
				System.out.println("2. Pop salary");
				System.out.println("3. Add first ");
				System.out.println("4. Add last");
				System.out.println("5. Peek first and last");
				System.out.println("6. List all salaries");
				System.out.println("7. Quit");

				option = Helper.getInt("\nEnter option => ");

				switch (option) {

				case 1:
					salary = Helper.getDouble("Enter salary: ");
					// TODO: Push salary into linked list.
					//       Display a success/failure message.
					//Push salary on top!
					salariesList.push(salary);
					System.out.println("Salary pushed!");
					break;

				case 2:
					// TODO: Pop salary off linked list.
					//       Display a success/failure message.
					Double removedSalary=salariesList.pop();
					System.out.println(removedSalary+" Popped!");
					break;

				case 3:
					salary = Helper.getDouble("Enter salary: ");
					// TODO: Add salary at the start of the linked list.
					//       Display a success/failure message.
					salariesList.add(0,salary);
					System.out.println(salary+" added at the start of the list!");
					break;

				case 4:
					salary = Helper.getDouble("Enter salary: ");
					// TODO: Add salary at the end of the linked list.
					//       Display a success/failure message.
					salariesList.add(salariesList.size()-1,salary);
					System.out.println(salary+" added to the end of the list!");
					break;

				case 5:
					// TODO: If linked list isn't empty, peek at the first and last entries.
					//       If linked list IS empty, display a suitable message
					if(salariesList.isEmpty())
						System.out.println("There are no salaries in the list!");
					else{
						System.out.println("Peeking at the front of the list: "+salariesList.peekFirst());
						System.out.println("Peeking at the rear of the list: "+salariesList.peekLast());
					}
					break;

				case 6:
					// TODO: Display all items in linked list.
					System.out.println("The items in the list are ");
					for(Double salary1 : salariesList)
						System.out.println(salary1);
					break;

				case 7:
					// This is a valid option, but there's nothing to do here.
					System.out.println("Zzzz!");
					break;

				default:
					System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}

		} while (option != 7);
	}


	// Work with a TreeMap of Employees.
	public static void manageEmployees() {

		// TODO: Declare a TreeMap to hold Employees (keyed by employee id).
		Map<String, Employee> employeeMap=new TreeMap<String, Employee>();


		// Miscellaneous helper variables.
		Employee emp;
		String id;

		// Display menu options in a loop.
		int option = -1;
		do {

			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a TreeMap of Employees (keyed by ID)");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Put employee");
				System.out.println("2. Remove employee for id");
				System.out.println("3. Is id present?");
				System.out.println("4. Is employee present?");
				System.out.println("5. Display first and last entries");
				System.out.println("6. Display all employees");
				System.out.println("7. Quit");

				option = Helper.getInt("\nEnter option => ");

				switch (option) {

				case 1:
					emp = Employee.createEmployee();
					// TODO: Put employee into map.
					//       Display a success/failure message.
					employeeMap.put(emp.getId(), emp);
					System.out.println("Employee "+emp.getId()+" inserted into the map!");
					break;

				case 2:
					id  = Helper.getString("Enter id: ");
					// TODO: Remove employee with specified id.
					//       Display a success/failure message.
					if(!employeeMap.keySet().contains(id))
						System.out.println("That ID is up for grabs!");
					else{
						employeeMap.remove(id);
						System.out.println("Removed the ID!");
					}
					break;

				case 3:
					id = Helper.getString("Enter id: ");
					// TODO: Display message indicating whether the map contains the specified id.
					if(employeeMap.containsKey(id))
						System.out.println("Yes, that ID is registered!");
					else
						System.out.println("Oopsie! That doesn't seem to exist yet!");
					break;

				case 4:
					emp = Employee.createEmployee();
					// TODO: Display message indicating whether the map contains an employee with the specified values.
					if(employeeMap.containsValue(emp))
						System.out.println("Yes, that employee does exist in the map");
					else
						System.out.println("No, that employee doesn't exist yet");
					break;

				case 5:
					// TODO: If map isn't empty, display the key/value for the first entry and for the last entry.
					//       If map IS empty, display a suitable message.
					if(employeeMap.isEmpty())
						System.out.println("Helooooo! <echo> Looks like there's no one here!");
					else{
						Iterator<String> idIterator = employeeMap.keySet().iterator();
						int size=employeeMap.size();
						System.out.println("The first employee: "+employeeMap.get(idIterator.next()).toString());
						for(int i=0;i<size-2;i++)
							idIterator.next();
						System.out.println("The last employee: "+employeeMap.get(idIterator.next()).toString());

					}
					break;

				case 6:
					// TODO: Display all employee objects (i.e. values) in map.
					for(String eid:employeeMap.keySet())
						System.out.println(employeeMap.get(eid).toString());
					break;

				case 7:
					// This is a valid option, but there's nothing to do here.
					System.out.println("zzz!");
					break;

				default:
					System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}

		} while (option != 7);
	}
}
