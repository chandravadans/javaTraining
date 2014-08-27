import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseFiles
{

	public static void main(String[] args)
	{
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader(new File("data.txt")));
		} 
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage() + "File not found");
			e.printStackTrace();
			return;
		}
		String line = null;
		
		try
		{
			while((line = reader.readLine()) != null)
				System.out.println("we read : " + line);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			reader.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage() + "Failed to close reader");
			e.printStackTrace();
		}

	}

}
