import java.sql.*;
public class P21  
{
	public static void main (String args[] )
	{
		int Quantity,Id;
		Double Price;
		String Name;
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table product(ID int AUTO_INCREMENT PRIMARY KEY,Name varchar(30),Price Double(30),Quantity int(20)); ");
			System.out.println("Id\t Name\t Price\t Quantity"); 
			con.close(); 
		}
		catch( Exception e)
		{
			 System.out.println(e);
		}
	}	
}