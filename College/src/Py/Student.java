package Py;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student 
{
public static void main(String[] args)
{
try
  {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","root");
	 Statement statement = connection.createStatement();
	 statement.execute("insert into student value(102,'Manu',22)");
	 statement.execute("insert into student value(103,'Manoj',23)");
	 statement.execute("insert into student value(104,'Madhu',24)");
	 connection.close();
	 System.out.println("Data Saved");
  }
  catch(ClassNotFoundException | SQLException e)
{
	  e.printStackTrace();
}
}
}
