package Py;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData 
{
	public static void main(String[] args)
	{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		while(resultSet.next())
		{
			System.out.println("the student id is"+resultSet.getInt(1));
			System.out.println("the student name is"+resultSet.getString(2));
			System.out.println("the student age is"+resultSet.getInt(3));
			
		}
		connection.close();
	}
	
		  catch(ClassNotFoundException | SQLException e)
	  	  {
			e.printStackTrace();
	 	  }
     }
  }