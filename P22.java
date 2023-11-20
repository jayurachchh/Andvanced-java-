import java.sql.*;
import java.util.Scanner;
public class P22
{
	public static void main(String[] args) 
	{		int a;
			String Name;
			try
			{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
			Statement stmt=con.createStatement();

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id");
			Integer ID=sc.nextInt();
			
			System.out.println("Enter the Name");
			Name=sc.next();

			System.out.println("Enter the Price");
			Double Price=sc.nextDouble();

			System.out.println("Enter the Quantity");
			Integer Quantity =sc.nextInt();

			a=stmt.executeUpdate("Insert Into product Values("+ID+",'"+Name+"',"+Price+","+Quantity+");");
			//a=stmt.executeUpdate("Insert Into p Values(3,'dfg',300,43);");
			if(a>0)
			{
			System.out.println("Sucessfully inserted data");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}