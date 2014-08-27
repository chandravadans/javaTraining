package com.citi;

public class StringOperationFundamentals
{
	public static void main(String[] args)
	{
		System.out
				.println("Enter any arbitary String, mate: \n kindly end it with a \"#\"");

		java.util.Scanner io = new java.util.Scanner(System.in);
		String str;
		do
		{
			str = io.next();
			int lengthOfString = str.length();
			System.out.println("Length of the input string is: "
					+ lengthOfString);

		} while (str != "#");
	}

}
