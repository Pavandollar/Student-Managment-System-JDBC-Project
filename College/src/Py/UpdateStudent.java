package Py;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent 
{
	public static void main(String[] args)
	{
	try
	  {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","root");
		 Statement statement = connection.createStatement();
		 statement.execute("update student set name='raj' where id=102");
		 connection.close();
		 System.out.println("Data Saved");
	  }
	  catch(ClassNotFoundException | SQLException e)
	{
		  e.printStackTrace();
	}
	}
}
