import java.sql.*;
import java.util.Scanner;
public class P25
{
	public static void main(String[] args) 
	{		
		int a,v=0;
			try
			{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
			Statement stmt=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id");
			Integer Id=sc.nextInt();
			
			
			a=stmt.executeUpdate("delete From product where id="+Id+";");
			
			if(a>0)
			{
			System.out.println("Sucessfully Deleteed Record");
			ResultSet rs=stmt.executeQuery("select * from emp"); 		
			while(rs.next())
			{ 
				v++;
			}
			System.out.println("Remaining Rows"+v);
			}
			}

			
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}