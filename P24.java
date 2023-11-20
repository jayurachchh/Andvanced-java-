import java.sql.*;
public class P24
{
	public static void main(String[] args) 
	{	int a;	
			try
			{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
			Statement stmt=con.createStatement();
			a=stmt.executeUpdate("Update product set Quantity=100 where price<1000");
			if(a>0)
			{
			System.out.println("Sucessfully Updated Record");
			}
			}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}