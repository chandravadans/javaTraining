package com.citi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket theServer=new Socket("192.168.0.16",9999);
			
			BufferedWriter toServer=new BufferedWriter(new OutputStreamWriter(theServer.getOutputStream()));
			toServer.append("Hello Server");
			
			
			//BufferedReader fromServer=new BufferedReader(new InputStreamReader(theServer.getInputStream()));
			
			//String serverOp;
			//serverOp=fromServer.readLine();
			//	System.out.println("Receieved: "+serverOp);
			
			
			
			theServer.close();
			toServer.close();
			//fromServer.close();
	
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
