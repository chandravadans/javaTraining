package com.citi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletJDBC
 */
@WebServlet("/db")
public class ServletJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Statement stmt;
	private Connection con;


	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try{
			String driverName=getInitParameter("Driver");
			String dbName=getInitParameter("Database");

			System.out.println(driverName);
			System.out.println(dbName);
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Pune2014","Pune2014","pune2014");
			stmt=con.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//System.out.println("Wheeee!");
	}
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletJDBC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			PrintWriter writer = response.getWriter();
			String query="select * from sailboat_table";
			ResultSet rs=stmt.executeQuery(query);
			writer.write("<html> <body> <table> ");
			while(rs.next()){
				writer.write("<tr>"+rs.getString(2)+"</tr> <br />");
			}
			writer.write("</table></body></html>");
			
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
