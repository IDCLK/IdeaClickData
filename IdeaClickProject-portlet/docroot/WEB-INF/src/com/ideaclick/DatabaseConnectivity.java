package com.ideaclick;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
	
	public void Db_Connect()
	{
		Connection con=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Class Found");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/liferay4me","root","root");
				System.out.println("Driver found");
			}catch(Exception e){
				System.out.println("Error:"+e);
			}
	}
}