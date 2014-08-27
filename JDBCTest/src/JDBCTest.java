import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTest
{
	public static void main(String[] args)
	{
		try{
			int i = 0;
			Connection theConnection=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			theConnection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Pune2014","Pune2014","pune2014");
			Statement stmt;
			stmt=theConnection.createStatement();
			String query="select * from sailboat_table";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString(4));
			}
		}
		catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		
	}

}
