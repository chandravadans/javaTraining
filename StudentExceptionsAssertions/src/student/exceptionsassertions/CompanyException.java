package student.exceptionsassertions;

// TODO: Write a CompanyException class, to represent any company-related exceptions.

public class CompanyException extends Exception
{
	String why;
	Exception theException;
	String idOfEmployee;
	
	public CompanyException(String message, String employeeId )
	{
		super(message + "\nEmployee being processed :" + employeeId);
		
	}
}