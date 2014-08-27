package com.citi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket serverSocket=new ServerSocket(9999);
			
			Socket clientSocket= serverSocket.accept();
			
			BufferedReader clientReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String line;
			while((line=clientReader.readLine())!=null){
				System.out.println(line);
			}
			
			serverSocket.close();
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
